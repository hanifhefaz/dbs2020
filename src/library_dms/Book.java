/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_dms;

/**
 *
 * @author Hefaz
 */
class Book {
int bid;
String bcallno;
int bcategory;
String bname;
String bauthor;
String bpub;
int bqt;

   public Book(int id, String callno, int category_id, String name, String author,String publisher,int quantity) {
        this.bid = id;
        this.bcallno = callno;
        this.bcategory = category_id;
        this.bname = name;
        this.bauthor = author;
        this.bpub = publisher;
        this.bqt = quantity;
                
    }

    public int getId() {
        return bid;
    }

    public String getCallno() {
       return bcallno;
    }

    public int getCategory() {
      return bcategory;
    }

    public String getName() {
      return bname;
      
    }

    public String getAuthor() {
      return bauthor;  
    }

    public String getPublisher() {
       return bpub;
    }

    public int getQuantity() {
       return bqt;
    }
    
}
