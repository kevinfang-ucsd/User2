package lab7.user2;

import com.firebase.client.Firebase;

/**
 * Created by kevin on 5/23/16.
 */
public class FirebaseContext extends android.app.Application{
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
