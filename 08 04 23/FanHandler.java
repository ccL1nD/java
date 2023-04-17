public class FanHandler extends Handler
{
    public  FanHandler (Handler successor)
    {
     super(successor);
    }

    public void HandlerRequest(Email email)
    {
        if (email.Type == EmailType.Fan)
        {
            System.out.println("Fan Handler is handling the following message...");
            System.out.println("Sending to the CEO...");
            System.out.println(email.Message);
        }
        else if (_successor !=null)
        {
            _successor.HandlerRequest(email);
        }
    }
}