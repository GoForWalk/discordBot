import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.exceptions.RateLimitedException;

import javax.security.auth.login.LoginException;

public class ExampleBot {

    private static final String BOT_TOKEN = "877022369754001438";

    private static final String BOT_NAME = "partyBot";

    public static void main(String[] args) throws LoginException, RateLimitedException, InterruptedException {

        JDABuilder builder = new JDABuilder((AccountType.BOT));
        builder.setToken(Args[0]);
        builder.setAutoReconnect(true);
        builder.setStatus(OnlineStatus.ONLINE);
        JDA jda = builder.bu
    }

}
