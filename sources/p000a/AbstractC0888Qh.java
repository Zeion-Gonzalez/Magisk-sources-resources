package p000a;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: a.Qh */
/* loaded from: classes.dex */
public abstract class AbstractC0888Qh {

    /* renamed from: z */
    public static final Field f3052z;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        f3052z = field;
    }
}
