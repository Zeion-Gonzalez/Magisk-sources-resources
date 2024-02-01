package p000a;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: a.nX */
/* loaded from: classes.dex */
public class C2098nX implements Iterator, InterfaceC1564dP {

    /* renamed from: R */
    public int f6472R;

    /* renamed from: S */
    public final /* synthetic */ int f6473S;

    /* renamed from: w */
    public final Object f6474w;

    public /* synthetic */ C2098nX(int i, Object obj) {
        this.f6473S = i;
        this.f6474w = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f6473S;
        Object obj = this.f6474w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (this.f6472R < ((C2616xE) obj).m4506o()) {
                    return true;
                }
                return false;
            case 1:
                if (this.f6472R < ((ViewGroup) obj).getChildCount()) {
                    return true;
                }
                return false;
            case 2:
                if (this.f6472R < ((AbstractC0386HL) obj).mo26h()) {
                    return true;
                }
                return false;
            default:
                if (this.f6472R < ((Object[]) obj).length) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f6473S;
        Object obj = this.f6474w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                int i2 = this.f6472R;
                this.f6472R = i2 + 1;
                return ((C2616xE) obj).m4505W(i2);
            case 1:
                int i3 = this.f6472R;
                this.f6472R = i3 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i3);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 2:
                if (hasNext()) {
                    int i4 = this.f6472R;
                    this.f6472R = i4 + 1;
                    return ((AbstractC0386HL) obj).get(i4);
                }
                throw new NoSuchElementException();
            default:
                try {
                    int i5 = this.f6472R;
                    this.f6472R = i5 + 1;
                    return ((Object[]) obj)[i5];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f6472R--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6473S) {
            case AbstractC0795Op.f2698E /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.f6474w;
                int i = this.f6472R - 1;
                this.f6472R = i;
                viewGroup.removeViewAt(i);
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2098nX(Object[] objArr) {
        this.f6473S = 3;
        this.f6474w = objArr;
    }
}
