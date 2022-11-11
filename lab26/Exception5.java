package lab26;

public class Exception5 {
    public void printMessageSafe(String key)
    {
        String message = getDetailsSafe(key); System.out.println( message );
    }

    public String getDetailsSafe(String key)
    {
        try
        {
            if (key == null)
            {
                throw new NullPointerException("null key in getDetails");
            }
        }
        catch (NullPointerException e)
        {
            key = "default";
        }
        return "data for " + key;
    }
}