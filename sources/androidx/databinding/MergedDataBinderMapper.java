package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.AbstractC2479uk;

/* loaded from: classes.dex */
public class MergedDataBinderMapper extends AbstractC2479uk {

    /* renamed from: z */
    public final HashSet f8963z = new HashSet();

    /* renamed from: h */
    public final CopyOnWriteArrayList f8961h = new CopyOnWriteArrayList();

    /* renamed from: v */
    public final CopyOnWriteArrayList f8962v = new CopyOnWriteArrayList();

    /* renamed from: N */
    public final boolean m4812N() {
        StringBuilder sb;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8962v;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Class<?> cls = Class.forName(str);
                if (AbstractC2479uk.class.isAssignableFrom(cls)) {
                    m4813P((AbstractC2479uk) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e) {
                e = e;
                sb = new StringBuilder("unable to add feature mapper for ");
                sb.append(str);
                Log.e("MergedDataBinderMapper", sb.toString(), e);
            } catch (InstantiationException e2) {
                e = e2;
                sb = new StringBuilder("unable to add feature mapper for ");
                sb.append(str);
                Log.e("MergedDataBinderMapper", sb.toString(), e);
            }
        }
        return z;
    }

    /* renamed from: P */
    public final void m4813P(AbstractC2479uk abstractC2479uk) {
        if (this.f8963z.add(abstractC2479uk.getClass())) {
            this.f8961h.add(abstractC2479uk);
            Iterator it = abstractC2479uk.mo4255z().iterator();
            while (it.hasNext()) {
                m4813P((AbstractC2479uk) it.next());
            }
        }
    }

    @Override // p000a.AbstractC2479uk
    /* renamed from: h */
    public final AbstractC2760z mo4253h(View view, int i) {
        Iterator it = this.f8961h.iterator();
        while (it.hasNext()) {
            AbstractC2760z mo4253h = ((AbstractC2479uk) it.next()).mo4253h(view, i);
            if (mo4253h != null) {
                return mo4253h;
            }
        }
        if (m4812N()) {
            return mo4253h(view, i);
        }
        return null;
    }

    @Override // p000a.AbstractC2479uk
    /* renamed from: v */
    public final AbstractC2760z mo4254v(View[] viewArr, int i) {
        Iterator it = this.f8961h.iterator();
        while (it.hasNext()) {
            AbstractC2760z mo4254v = ((AbstractC2479uk) it.next()).mo4254v(viewArr, i);
            if (mo4254v != null) {
                return mo4254v;
            }
        }
        if (m4812N()) {
            return mo4254v(viewArr, i);
        }
        return null;
    }
}
