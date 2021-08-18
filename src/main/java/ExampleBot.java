import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

import javax.security.auth.login.LoginException;

public class ExampleBot {

    private static String BOT_TOKEN = "ODc3MDIyMzY5NzU0MDAxNDM4.YRskuw.GbePJvE9F-GfwYgoCHQe-d7KDao";

    public static void main(String[] Args) throws LoginException, RateLimitedException, InterruptedException{

        JDABuilder builder = new JDABuilder((AccountType.BOT));
        builder.setToken(Args[0]);
        builder.setAutoReconnect(true);
        builder.setStatus(OnlineStatus.ONLINE);
        JDA jda =  builder.buildBlocking();
    }
}
