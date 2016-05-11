package project.gym.com.br.totaltrainning11;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import project.gym.com.br.totaltrainning11.TabsTrasaction.FinishTabsActivity;


public class LoginActivity extends ActionBarActivity{
    private EditText user;
    private EditText passaword;

    public void onCreate(Bundle savedInstanceState ){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        user = (EditText) findViewById(R.id.user);
        passaword = (EditText) findViewById(R.id.password);

    }

    public void entrarOnClick(View v){
        String usuarioInformado = user.getText().toString();
        String senhaInformada = passaword.getText().toString();

        if("a".equals(usuarioInformado) &&
                "a".equals(senhaInformada)){

            Intent intent = new Intent(LoginActivity.this,FinishTabsActivity.class);
            startActivity(intent);
        }else{
            String mensagemErro = getString(R.string.erro_autenticacao);
            Toast toast = Toast.makeText(this,mensagemErro,Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}

