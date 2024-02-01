package p000a;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a.h2 */
/* loaded from: classes.dex */
public abstract class AbstractC1759h2 {

    /* renamed from: h */
    public static final AbstractC0119CI f5553h;

    /* renamed from: z */
    public static final C0079BW f5554z = new C0079BW();

    static {
        AbstractC0119CI abstractC0119CI;
        try {
            abstractC0119CI = (AbstractC0119CI) C1739gj.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC0119CI = null;
        }
        f5553h = abstractC0119CI;
    }

    /* renamed from: z */
    public static final void m3290z(int i, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
