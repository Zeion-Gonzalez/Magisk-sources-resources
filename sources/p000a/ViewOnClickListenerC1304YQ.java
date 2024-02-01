package p000a;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.YQ */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1304YQ implements View.OnClickListener {

    /* renamed from: I */
    public Context f4155I;

    /* renamed from: R */
    public final String f4156R;

    /* renamed from: S */
    public final View f4157S;

    /* renamed from: w */
    public Method f4158w;

    public ViewOnClickListenerC1304YQ(View view, String str) {
        this.f4157S = view;
        this.f4156R = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f4158w == null) {
            View view2 = this.f4157S;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f4156R;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f4158w = method;
                            this.f4155I = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                } else {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
            }
        }
        try {
            this.f4158w.invoke(this.f4155I, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
