import com.intellij.openapi.actionSystem {
    AnAction,
    AnActionEvent
}
import com.intellij.notification {
    Notification,
    Notifications,
    NotificationType
}
import ceylon.html {
    B
}

shared class MySampleAction() extends AnAction() {
    
    shared actual void actionPerformed(AnActionEvent evt) {
        value what = B {"amazing"}.string;
        
        Notifications.Bus.notify(Notification(
            "ceylon",
            "Hello from Ceylon",
            "Dude, this is ``what``!",
            NotificationType.\iINFORMATION
        ));
        
        fun(Parameterized<String>());
        fun(Parameterized<Integer>());
    }
    
    class Parameterized<T>() {
        
    }
    
    void fun(Object o) {
        if (is Parameterized<String> o) {
            print("true");
        } else {
            print("false");
        }
    }
}