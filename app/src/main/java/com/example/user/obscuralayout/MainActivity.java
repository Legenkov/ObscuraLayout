package com.example.user.obscuralayout;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.user.obscuralayout.Fragments.ChatFragment;
import com.example.user.obscuralayout.Fragments.ForumFragment;
import com.example.user.obscuralayout.Fragments.PeopleFragment;
import com.example.user.obscuralayout.Fragments.ProfileFragment;
import com.example.user.obscuralayout.Fragments.SearchFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private IObscura obscura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private IObscura Iobscura = new IObscura() {

        @Override
        public void openProfile() {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.for_fragment, ProfileFragment.newInstance(this))
                    .commit();
        }

        @Override
        public void openPeople() {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.for_fragment, PeopleFragment.newInstance(this))
                    .commit();
        }

        @Override
        public void openForum() {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.for_fragment, ForumFragment.newInstance(this))
                    .commit();
        }

        @Override
        public void openSearch() {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.for_fragment, SearchFragment.newInstance(this))
                    .commit();
        }



        @Override
        public void openChat() {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.for_fragment, ChatFragment.newInstance(this))
                    .commit();
        }

        @Override
        public void deleteAccount() {

        }

        @Override
        public void cancelDelete() {

        }

    };

        @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_chat:
                Iobscura.openChat();
            case R.id.action_forum:
                Iobscura.openForum();
            case R.id.action_people:
                Iobscura.openPeople();
            case R.id.action_profile:
                Iobscura.openProfile();
            case R.id.action_search:
                Iobscura.openSearch();
        }
        return false;
    }
}
