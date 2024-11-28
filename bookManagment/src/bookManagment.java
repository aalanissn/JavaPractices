public class bookManagment
{
        private String qualification;
        private String author;
        private int publicationYear;
        private String gender;

        //Constructor
        public bookManagment (String qualification, String author, int publicationYear, String gender)
        {
            this.qualification = qualification;
            this.author = author;
            this.publicationYear = publicationYear;
            this.gender = gender ;
        }

        public String getQualification()
        {
            return qualification;
        }
        public void Setqualification (String qualification)
        {
            this.qualification = qualification;
        }
        public String getAuthor()
        {
            return author;
        }
        public void setAuthor()
        {
            this.author = author;
        }
        public int getpublicationYear()
        {
            return publicationYear;
        }
        public void setPublicationYear(int publicationYear)
        {
            this.publicationYear = publicationYear;
        }
        public String getGender()
        {
            return getGender();
        }
        public void setGender()
        {
            this.gender = gender;
        }

    //    @override
        public String toString()
        {
            return "bookManagment{" +
                "Qualification='" + qualification + '\'' +
                ", Author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", gender='" + gender + '\'' + '}';
        }
        public void printdetails()
        {
            System.out.println(this.toString());
        }

}

