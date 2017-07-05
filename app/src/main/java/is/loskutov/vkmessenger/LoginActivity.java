package is.loskutov.vkmessenger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.vk.sdk.VKSdk;

public class LoginActivity extends AppCompatActivity {

    public EditText login, password;
    public Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initViews();
        VKSdk.initialize(this);

        setContentView(R.layout.activity_login);
    }

    protected void initViews() {
        login = (EditText) findViewById(R.id.login);
        password = (EditText) findViewById(R.id.password);
        loginButton = (Button) findViewById(R.id.login_button);
    }

    protected void clickLoginButton() {
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VKSdk.login(LoginActivity.this);
            }
        });
    }
}
