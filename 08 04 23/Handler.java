public abstract class Handler
{
    protected Handler _successor;

    public Handler(Handler successor)
    {
        _successor = successor;
    }

    public abstract void HandlerRequest (Email email);
}