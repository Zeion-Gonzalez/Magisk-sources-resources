package p000a;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: a.Lt */
/* loaded from: classes.dex */
public abstract class AbstractC0632Lt {

    /* renamed from: h */
    public Object f2045h;

    /* renamed from: v */
    public Object f2046v;

    /* renamed from: z */
    public Object f2047z;

    public AbstractC0632Lt(int i) {
        if (i != 2) {
            return;
        }
        this.f2046v = new C2742zm(this);
    }

    /* renamed from: I */
    public static boolean m1402I(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: s */
    public static boolean m1403s(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: E */
    public final Object[] m1404E(int i, Object[] objArr) {
        int mo1416o = mo1416o();
        if (objArr.length < mo1416o) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), mo1416o);
        }
        for (int i2 = 0; i2 < mo1416o; i2++) {
            objArr[i2] = mo1409Q(i2, i);
        }
        if (objArr.length > mo1416o) {
            objArr[mo1416o] = null;
        }
        return objArr;
    }

    /* renamed from: G */
    public abstract int mo1405G(Object obj);

    /* renamed from: M */
    public abstract void mo1406M(Object obj, Object obj2);

    /* renamed from: N */
    public abstract void mo1407N();

    /* renamed from: P */
    public abstract int[] mo1408P(AbstractC0667Md abstractC0667Md, View view);

    /* renamed from: Q */
    public abstract Object mo1409Q(int i, int i2);

    /* renamed from: R */
    public abstract String mo606R();

    /* renamed from: S */
    public abstract Object mo1410S(int i, Object obj);

    /* renamed from: U */
    public final void m1411U() {
        AbstractC0667Md abstractC0667Md;
        View mo1417q;
        RecyclerView recyclerView = (RecyclerView) this.f2047z;
        if (recyclerView == null || (abstractC0667Md = recyclerView.f9077J) == null || (mo1417q = mo1417q(abstractC0667Md)) == null) {
            return;
        }
        int[] mo1408P = mo1408P(abstractC0667Md, mo1417q);
        int i = mo1408P[0];
        if (i != 0 || mo1408P[1] != 0) {
            ((RecyclerView) this.f2047z).m4934he(i, mo1408P[1], false);
        }
    }

    /* renamed from: V */
    public abstract void mo1412V(int i);

    /* renamed from: W */
    public abstract int mo1413W(Object obj);

    /* renamed from: g */
    public final MenuItem m1414g(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC1409aS) {
            InterfaceMenuItemC1409aS interfaceMenuItemC1409aS = (InterfaceMenuItemC1409aS) menuItem;
            if (((C2698yx) this.f2045h) == null) {
                this.f2045h = new C2698yx();
            }
            MenuItem menuItem2 = (MenuItem) ((C2698yx) this.f2045h).getOrDefault(interfaceMenuItemC1409aS, null);
            if (menuItem2 == null) {
                MenuItemC0324GE menuItemC0324GE = new MenuItemC0324GE((Context) this.f2047z, interfaceMenuItemC1409aS);
                ((C2698yx) this.f2045h).put(interfaceMenuItemC1409aS, menuItemC0324GE);
                return menuItemC0324GE;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* renamed from: k */
    public abstract int mo1415k(AbstractC0667Md abstractC0667Md, int i, int i2);

    /* renamed from: o */
    public abstract int mo1416o();

    /* renamed from: q */
    public abstract View mo1417q(AbstractC0667Md abstractC0667Md);

    /* renamed from: u */
    public abstract C1186WB mo1418u();

    /* renamed from: v */
    public final InterfaceC2721zM m1419v() {
        ((AbstractC1687fj) this.f2047z).m3192z();
        if (((AtomicBoolean) this.f2045h).compareAndSet(false, true)) {
            return (InterfaceC2721zM) ((InterfaceC1841if) this.f2046v).getValue();
        }
        String mo606R = mo606R();
        AbstractC1687fj abstractC1687fj = (AbstractC1687fj) this.f2047z;
        abstractC1687fj.m3192z();
        abstractC1687fj.m3188h();
        InterfaceC0771ON interfaceC0771ON = abstractC1687fj.f5278P;
        if (interfaceC0771ON == null) {
            interfaceC0771ON = null;
        }
        return interfaceC0771ON.mo1790l().mo1944j(mo606R);
    }

    /* renamed from: w */
    public abstract C1100Ud mo1420w(AbstractC0667Md abstractC0667Md);

    /* renamed from: y */
    public final void m1421y(InterfaceC2721zM interfaceC2721zM) {
        if (interfaceC2721zM == ((InterfaceC2721zM) ((InterfaceC1841if) this.f2046v).getValue())) {
            ((AtomicBoolean) this.f2045h).set(false);
        }
    }

    public AbstractC0632Lt(AbstractC1687fj abstractC1687fj) {
        this.f2047z = abstractC1687fj;
        this.f2045h = new AtomicBoolean(false);
        this.f2046v = new C1146VR(new C1407aQ(3, this));
    }

    public AbstractC0632Lt(Context context) {
        this.f2047z = context;
    }
}
