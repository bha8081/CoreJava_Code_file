class Movie
{
    String name;
    String hero;

    public String toString()
    {
        // return "Bhavesh";
        return name +" : "+hero;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((hero == null) ? 0 : hero.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Movie other = (Movie) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (hero == null) {
            if (other.hero != null)
                return false;
        } else if (!hero.equals(other.hero))
            return false;
        return true;
    }

    // public boolean equals(Movie that)
    // {
    //     if(this.name.equals(that.name) && this.hero.equals(that.hero))
    //     return true;
    //     else
    //     return false;
    // }

    

}

public class ObjectDemo
{
    public static void main(String[] args)
    {
        Movie m = new Movie();
        m.name = "Hanuman";
        m.hero = "Raj teja";

        Movie m2 = new Movie();
        m2.name = "Hanuman";
        m2.hero = "Raj teja";

        boolean result = m.equals(m2);

        System.out.println(result);
    }
}