public class ComplaintHandler extends Handler
{
    public ComplaintHandler (Handler successor)
    {
     super(successor);
    }

    public void HandlerRequest(Email email)
    {
        if (email.Type == EmailType.Complaint)
        {
            System.out.println("Complaint Handler is handling the following message...");
            System.out.println("Sending to  the legal department...");
            System.out.println(email.Message);
        }
        else if (_successor !=null)
        {
            _successor.HandlerRequest(email);
        }
    }
}