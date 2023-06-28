package com.example.practical16;
import android.os.Bundle;
import android.view.View;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;
    public class MainActivity extends AppCompatActivity
    {
        @Override
        protected	void	onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
   public void selectFragment(View view) {
// creating object for Fragment
     Fragment fr;
// displaying first fragment
// if button1 is clicked
    if(view == findViewById(R.id.button1)) {
        fr = new FragmentOne();
    }
// displaying second fragment
// if button2 is clicked
    else {
     fr = new FragmentTwo();
    }
    FragmentManager	fm	= getFragmentManager();
// fragment transaction to add or replace
// fragments while activity is running
FragmentTransaction fragmentTransaction = fm.beginTransaction();
fragmentTransaction.replace(R.id.fragment_section,fr);
// making a commit after the transaction
// to assure that the change is effective
   fragmentTransaction.commit();
}
}
