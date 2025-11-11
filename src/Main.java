import util.SupabaseClient;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Fetching data from Supabase...");
        String data = SupabaseClient.get("tshepobankingapp.customers");
        System.out.println(data);
    }
}
