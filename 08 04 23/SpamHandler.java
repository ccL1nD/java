public class SpamHandler extends Handler
{
    public SpamHandler (Handler successor)
    {
     super(successor);
    }

    public void HandlerRequest(Email email)
    {
        if (email.Type == EmailType.Spam)
        {
            System.out.println("Spam Handler is handling the following message...");
            System.out.println("Deleting the following email...");
            System.out.println(email.Message);
        }
        else if (_successor !=null)
        {
            _successor.HandlerRequest(email);
        }
    }
}