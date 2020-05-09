# ***Library Management System***

### Hanif Hefaz
### Supervisor: Ing. Rastislav Bencel, PhD.

### SS 2019/2020

- [x]  First Scenario

- [x]  Second and Third Scenarios

- [x]  Forth and Fifth Scenarios

- [x]  Implementing ORM

- [x]  Adding Status Queries

## About

**Installation**
This project is done in Netbeans, Java and MySql. the database name is library, username for the database is root and there is no password for the databse. XAMPP server was installed for MySQL. 

**Technologies**

*Java*

*MySQL*

Run the program and a splashscreen will appear. upon completing the splachscreen, you will be directed to the main login page, where Admin and Librarians can login. 

**Admin Login:**

*Username:* hanif

*Password:* hanif

**Librarian Login:**

*Username:* khan

*Password:* khan

or any other librarian that is saved in the database.

## First Scenario

up to date, what the project is able to do is that when we start the application, a splash creen will appear, and upon 100% completion of the splash the user will be directed to login menu. in the login, what is working up to date is that only librarian can login to the library and add books. the admin section will be added later.

a librarian can login to the application by typing correct name from the database. admin will be responsible for adding these librarians. if the login details are correct, he will be able to login. once the user logged in, he cand add books, view books, issue books and others. 
what the applicaiton is able up to do is that the librarian just can add books. 

Insert queries are used in each form where needed, for example if we want to add students, the below query is used.

```Java
public static int save(String name,String contact){
		int status=0;
		try{
                    try (java.sql.Connection con = DB.getConnection()) {
                        PreparedStatement ps=con.prepareStatement("insert into students(name,contact) values(?,?)");
                        ps.setString(1,name);
                        ps.setString(2,contact);
                        status=ps.executeUpdate();
                    }
		}catch(SQLException e){
                    System.out.println(e);}
		return status;
	}
```
the same way an insert query is used for each form.


## Second and Third Scenarios

The second and third scenarios will be ***`delete`*** and ***`view`*** respectively. the deletion of a book a librarian or a student will take place based on `id` of the selected item. since we are using a unique id for each item therefore we are going to use that id for deletion from the database. for example to delete a student I used this query.

```Java
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
         String query = "DELETE FROM `students` WHERE `id`="+jTextField1.getText();
        executeSQlQuery(query, "Deleted");
    }
 ```
the same way other queries are used to delete any unwanted data.

to view data, there are two possibilities. the first one is that I generated a single table that shows all the related data. for this something like this is used. example to viewbooks.

```Java
PreparedStatement ps=con.prepareStatement("select * from books",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
```
another way is that we can also view data when we want to update it. this time some complex queries are used to load that data to the table and view it. we later can update it as well. for example to view students in UpdateStudents form:

```Java
how.res = how.stat.executeQuery("select * from students limit "+numClick+" , 100 ");
```
the same way is implemented in all other forms, where we want to view data.

More functionality added to the system. a ***splash screen*** was added to show the status of the application that, its opening now.

Some ***GUI*** changes made to some forms in order to navigate the user correctly.

***ADMIN*** section was added in order to **add**, **view** and **delete** librarians. there is only one Admin for the system, who decides to add librarains or delete them.

***ISSUE BOOKS*** and ***RETURN BOOKS*** forms were added. in order to `issue` a book to a `student`, we have to add that student first in the system. and then we can issue him/her books based on his/her id. all the `issued` books will go to another table called `issued`. the issued table will contain the `student_id` which is a forign key from the `students` table and a `bookcallno` which is a forign key from the `books` table. Whenever a student wants to `return` a book, the librarian has to enter `bookcallno` and `student_id`, and the book will be automatically deleted from the issued books, and the value of the issued book will be added by `1` in the `books` table. this way we can keep track of the `quantity` of the books.

in order to ***`view`*** items in the database, a `JTable` is used to select and show all the availabe data from the database, which was added by the first scenario. so far up to date the librarian will be able to view all students, books, and issued books.

## Forth & Fifth Scenarios

So far I implemented Insert, delete and view. in the forth and fifth scenarios I implemented Update, filter, pagination and the the statistics form was imporoved.

Here I will go to explain all the important things used the final scenarios.

to do update in the database queries like this are used in the application for example to update students: 

```Java
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
         String query = "UPDATE `students` SET `name`='"+jTextField2.getText()+"',`contact`="+jTextField3.getText()+" WHERE `id` = "+jTextField1.getText();
       executeSQlQuery(query, "Updated");
```
The same way is implemented for all other secitons.

I also used pagination, filter, agrregation and joins in the statistic form. the statistics form shows different tables, and each one is used for different porpuse. for example: Students with most issued books, to know which student has got more books:
```Java
how.res = how.stat.executeQuery("select name,student_id, count(bookcallno) from issued inner join students on students.id=issued.student_id group by student_id order by COUNT(student_id) DESC");
```
Now what if we wanted to know which book is issued the most? for this porpuse this query is used:
```Java
how.res = how.stat.executeQuery("SELECT books.name, books.callno, books.issued from books ORDER BY issued DESC limit 10");
```
Or lets say we want to see only books in the 1st floor or 2nd floor. for this purpose a `WHERE` cluase is used with a combo buttion. the query looks something like this:
```Java
how.res = how.stat.executeQuery("select books.callno, books.name, location.floor, location.shelf from books "
                    + "inner join location on books.callno= location.bookcallno"
                    + " where location.floor ='"+jComboBox2.getSelectedItem()+"' limit 10");
```
Or we want to see how many books have been written by an auther and show thier publishers. for this a query like this is implemented:
```Java
how.res = how.stat.executeQuery("select books.callno, books.name, author.name, publisher.name from books"
                    + " inner join author on author.id = books.author_id "
                    + "inner join publisher on publisher.id = books.publisher_id "
                    + "where author.id='"+jTextField5.getText()+"'");
```
and finally if we wanted to see all books of each category a filter is used where again the `WHERE` clause is used to filter by category all the books. the query looks something like this:
```Java
how.res = how.stat.executeQuery("select books.callno, category.name, books.name, "
                    + "author.name, publisher.name from books"
                    + " inner join author on author.id = books.author_id "
                    + "inner join category on category.id=books.category_id "
                    + "inner join publisher on publisher.id = books.publisher_id "
                    + "where category.name='"+jComboBox1.getSelectedItem()+"' limit 100");
```
the `pagination` is also implemented. lets say we want to paginate all the books of one category. this is implemented in statistics form. the query looks like this. where the numClick is the value of pages we want to paginate:
```Java
how.res = how.stat.executeQuery("select books.callno, category.name, books.name, "
                    + "author.name, publisher.name from books"
                    + " inner join author on author.id = books.author_id "
                    + "inner join category on category.id=books.category_id "
                    + "inner join publisher on publisher.id = books.publisher_id "
                    + "where category.name='"+jComboBox1.getSelectedItem()+"' limit "+numClick+", 100");
```
here also the `numClick` is used. later we can change it to the amount of combo Box. the same technique is used for previous button but for that I decrease the amount of items.

`Indexes` were implemented in all the important fields that are used somehow in queries.

the `data model` was improved and around 35 millions data was added. creation of two more tables `authors` and `publishers` was implemented.

## Implementing ORM (Object Relaional Model)
for adding two more scenarios I chose, implementing ORM, and adding status queries (which returns us the status for different queries). I have implemented ORM using Hibernate in netbeans Java application. for this porpuse, I have added `Hibernate Library` and then modefied the configuration file. I then added a GUI form to return the list of all authors based on searching or entering first name or any letter, using ORM. 

the query used in ORM looks something like this:

```private static final String QUERY_BASED_ON_FIRST_NAME="from Author a where a.name like '";

    private void runQueryBasedOnFirstName() {
        executeHQLQuery(QUERY_BASED_ON_FIRST_NAME + jTextField1.getText() + "%'");
    }
```    
I then, defined the queryExecuttion and then implemented List to return us the results.

```
private void executeHQLQuery(String hql) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List resultList = q.list();
            displayResult(resultList);
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }

    }

    private void displayResult(List resultList) {
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Id");
        tableHeaders.add("Name");
        tableHeaders.add("Born On");
        tableHeaders.add("City");

        for (Object o : resultList) {
            Author actor = (Author) o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(actor.getId());
            oneRow.add(actor.getName());
            oneRow.add(actor.getBYear());
            oneRow.add(actor.getCity());
            tableData.add(oneRow);
        }
        jTable1.setModel(new DefaultTableModel(tableData, tableHeaders));

    }
```

and this way, I have successfully, returned the list of all users using ORM.

![Image](https://www.github.com/hanifhefaz/dbs2020/ORM.png)

## Adding status Queries

In this scenario I have tried to implement more status queries.
