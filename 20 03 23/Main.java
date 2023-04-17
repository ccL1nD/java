class Main
{
    static void main(string[] args)
    {
        Subject subject = new RealSubject();

        System.out.println("Owner work:");
        TryAccess(new Proxy(subject, "Owner"),"John");

        System.out.println("Administrator work:");
        TryAccess(new Proxy(subject, "Administrator"),"Mark");

        System.out.println("Manager work:");
        TryAccess(new Proxy(subject, "Manager"),"Lola");

        System.out.println("User work:");
        TryAccess(new Proxy(subject, "Owner"),"gigi");
    }

    static void TryAccess(Subject proxy,string name)
    {
        try
        {
            proxy.Create(name, "TestValue");
            System.out.println("Create - Ok!");
        }
        catch(Exception ex)
        {
            System.out.println(ex.Message);
        }

        try
        {
            proxy.Read("TestKey");
            System.out.println("Read - Ok!");
        }
        catch(Exception ex)
        {
            System.out.println(ex.Message);
        }

        try
        {
            proxy.Update(name, "NewTestValue");
            System.out.println("Update - Ok!");
        }
        catch(Exception ex)
        {
            System.out.println(ex.Message);
        }

        try
        {
            proxy.Delete(name);
            System.out.println("Delete - Ok!");
        }
        catch(Exception ex)
        {
            System.out.println(ex.Message);
        }

        System.out.println(new string('-', 50));

    }

    
}