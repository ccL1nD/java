public class NewLocHandler extends Handler
{
    public NewLocHandler (Handler successor)
    {
     super(successor);
    }

    public void HandlerRequest(Email email)
    {
        if (email.Type == EmailType.Unclassified)
        {
            System.out.println("New Handler is handling the following message...");
            System.out.println("Sending to business development...");
            System.out.println(email.Message);
        }
        else if (_successor !=null)
        {
            _successor.HandlerRequest(email);
        }
    }
}