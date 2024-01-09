class This_Keyword
{
    String book;
    String author;

    public This_Keyword()
    {
        book = "Java";
        author = "Jemsh Gosale";
        System.out.println("Constructor block");
    }

    public String getBook_Name()
    {
        return book;
    }
    public void setBook_Name(String book)
    {
        this.book = book;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }

    public static void main(String[] args)
    {
        This_Keyword tk = new This_Keyword();

        System.out.println(tk.getBook_Name()+ " : "+tk.getAuthor());
    }
}

// class This_Keyword
// {
//     String name;
//     int age;

//     This_Keyword(String name, int age)
//     {
//         this.name = name;
//         this.age = age;
//     }

//     public static void main(String[] args)
//     {
//         This_Keyword key1 = new This_Keyword("Ram", 24);
//         This_Keyword key2 = new This_Keyword("Santose", 35);

//         System.out.println(key1.name+" : "+key1.age);
//         System.out.println(key2.name+" : "+key2.age);
//     }
// }