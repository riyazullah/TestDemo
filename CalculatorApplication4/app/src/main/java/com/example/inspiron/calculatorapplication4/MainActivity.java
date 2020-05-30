package com.example.inspiron.calculatorapplication4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.OperationApplicationException;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ZoomButtonsController;


public class MainActivity extends AppCompatActivity {
    int a[] = {R.id.b1, R.id.b2, R.id.b3, R.id.bplus, R.id.b4, R.id.b5, R.id.b6, R.id.bminus, R.id.b7, R.id.b8, R.id.b9, R.id.bmulti, R.id.b0, R.id.bmod, R.id.bdiv, R.id.bcancel, R.id.bequal};
    EditText et1;
    private ButtonClickListener mClickListener;
    String optr;
    int op1;
    int op2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.editText);
        mClickListener = new ButtonClickListener();
        for (int id : a) {
            View v = findViewById(id);
            v.setOnClickListener(mClickListener);
        }
    }




    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Editable str = et1.getText();
            switch (v.getId()) {
                case R.id.b0:
                    if (op2 != 0) {
                        op2 = 0;
                        et1.setText("");
                    }
                    str = str.append("0");
                    et1.setText(str);
                    break;
                case R.id.b1:
                    if (op2 != 0) {
                        op2 = 0;
                        et1.setText("");
                    }
                    str = str.append("1");
                    et1.setText(str);
                    break;
                case R.id.b2:
                    if (op2 != 0) {
                        op2 = 0;
                        et1.setText("");
                    }
                    str = str.append("2");
                    et1.setText(str);
                    break;
                case R.id.b3:
                    if (op2 != 0) {
                        op2 = 0;
                        et1.setText("");
                    }
                    str = str.append("3");
                    et1.setText(str);
                    break;
                case R.id.b4:
                    if (op2 != 0) {
                        op2 = 0;
                        et1.setText("");
                    }
                    str = str.append("4");
                    et1.setText(str);
                    break;
                case R.id.b5:
                    if (op2 != 0) {
                        op2 = 0;
                        et1.setText("");
                    }
                    str = str.append("5");
                    et1.setText(str);
                    break;
                case R.id.b6:
                    if (op2 != 0) {
                        op2 = 0;
                        et1.setText("");
                    }
                    str = str.append("6");
                    et1.setText(str);
                    break;
                case R.id.b7:
                    if (op2 != 0) {
                        op2 = 0;
                        et1.setText("");
                    }
                    str = str.append("7");
                    et1.setText(str);
                    break;
                case R.id.b8:
                    if (op2 != 0) {
                        op2 = 0;
                        et1.setText("");
                    }
                    str = str.append("8");
                    et1.setText(str);
                    break;
                case R.id.b9:
                    if (op2 != 0) {
                        op2 = 0;
                        et1.setText("");
                    }
                    str = str.append("9");
                    et1.setText(str);
                    break;
                case R.id.bcancel:
                    op1 = 0;
                    op2 = 0;
                    et1.setText("");
                    et1.setHint("perform operation:");
                    break;
                case R.id.bplus:
                    optr = "+";
                    if (op1 == 0) {
                        op1 = Integer.parseInt(et1.getText().toString());
                        et1.setText("");
                    } else if (op2 != 0) {
                        op2 = 0;
                        et1.setText("");
                    } else {
                        op2 = Integer.parseInt(et1.getText().toString());
                        et1.setText("");
                        op1 = op1 + op2;
                        et1.setText(Integer.toString(op1));
                    }
                    break;
                case R.id.bminus:
                    optr = "-";
                    if (op1 == 0) {
                        op1 = Integer.parseInt(et1.getText().toString());
                        et1.setText("");
                    } else if (op2 != 0) {
                        op2 = 0;
                        et1.setText("");
                    } else {
                        op2 = Integer.parseInt(et1.getText().toString());
                        et1.setText("");
                        op1 = op1 - op2;
                        et1.setText(Integer.toString(op1));
                    }
                    break;
                case R.id.bmulti:
                    optr = "*";
                    if (op1 == 0) {
                        op1 = Integer.parseInt(et1.getText().toString());
                        et1.setText("");
                    } else if (op2 != 0) {
                        op2 = 0;
                        et1.setText("");
                    } else {
                        op2 = Integer.parseInt(et1.getText().toString());
                        et1.setText("");
                        op1 = op1 * op2;
                        et1.setText(Integer.toString(op1));
                    }
                    break;
                case R.id.bdiv:
                    optr = "/";
                    if (op1 == 0) {
                        op1 = Integer.parseInt(et1.getText().toString());
                        et1.setText("");
                    } else if (op2 != 0) {
                        op2 = 0;
                        et1.setText("");
                    } else {
                        op2 = Integer.parseInt(et1.getText().toString());
                        et1.setText("");
                        op1 = op1 / op2;
                        et1.setText(Integer.toString(op1));
                    }
                    break;
                case R.id.bmod :
                    optr = "%";
                    if (op1 == 0) {
                        op1 = Integer.parseInt(et1.getText().toString());
                        et1.setText("");
                    } else if (op2 != 0) {
                        op2 = 0;
                        et1.setText("");
                    } else {
                        op2 = Integer.parseInt(et1.getText().toString());
                        et1.setText("");
                        op1 = op1 % op2;
                        et1.setText(Integer.toString(op1));
                    }
                    break;
                case R.id.bequal:
                    if (!optr.equals(null)) {
                        if (op2 != 0) {
                            if (optr.equals("+")) {
                                et1.setText("");
                                et1.setText(Integer.toString(op1));
                            } else if (optr.equals("-")) {
                                et1.setText("");
                                op1 = op1 - op2;
                                et1.setText(Integer.toString(op1));
                            } else if (optr.equals("/")) {
                                et1.setText("");
                                op1 = op1 / op2;
                                et1.setText(Integer.toString(op1));
                            }
                        } else {
                            Operation();
                        }
                        break;
                    }
            }

        }
    }

    public void Operation() {
        if (optr.equals("+")) {
            op2 = Integer.parseInt(et1.getText().toString());
            et1.setText("");
            op1 = op1 + op2;
            et1.setText(Integer.toString(op1));
        } else if (optr.equals("-")) {
            op2 = Integer.parseInt(et1.getText().toString());
            et1.setText("");
            op1 = op1 - op2;
            et1.setText(Integer.toString(op1));
        } else if (optr.equals("*")) {
            op2 = Integer.parseInt(et1.getText().toString());
            et1.setText("");
            op1 = op1 * op2;
            et1.setText(Integer.toString(op1));
        } else if (optr.equals("/")) {
            op2 = Integer.parseInt(et1.getText().toString());
            et1.setText("");
            op1 = op1 / op2;
            et1.setText(Integer.toString(op1));
        }
        else if (optr.equals("%")) {
            op2 = Integer.parseInt(et1.getText().toString());
            et1.setText("");
            op1 = op1 % op2;
            et1.setText(Integer.toString(op1));


        }
    }

}


