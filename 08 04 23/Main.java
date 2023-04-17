class Main
{
    public static void main(String[] args)
    {
        Handler emailHandler = new SpamHandler(new FanHandler(new ComplaintHandler(new NewLocHandler(null))));

    

    Email eSpam = new Email (EmailType.Spam, "Dear Dir, I am a Nigerian price in need to transfer large\n sums of monney out of country. All I need is your bank account number...");
    emailHandler.HandlerRequest(eSpam);

    Email eFan = new Email (EmailType.Fan, "I love your gumball machines! Plese stock them with more buble-gum flavors :-)");
    emailHandler.HandlerRequest(eFan);

    Email eComplaint = new Email (EmailType.Complaint, "I swear, if I get one more black licorice flavored gumball \n I am going to break your machines!");
    emailHandler.HandlerRequest(eComplaint);

    Email eOther = new Email (EmailType.Unclassified, "We would love to have one of your machines installed in our dentist wairing room...");
    emailHandler.HandlerRequest(eOther);
    }

    
}