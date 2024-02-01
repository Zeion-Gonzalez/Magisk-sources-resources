package p000a;

import java.util.Map;

/* renamed from: a.Ql */
/* loaded from: classes.dex */
public final class C0891Ql implements Map.Entry, InterfaceC1564dP {

    /* renamed from: R */
    public final int f3054R;

    /* renamed from: S */
    public final C0642M4 f3055S;

    public C0891Ql(C0642M4 c0642m4, int i) {
        this.f3055S = c0642m4;
        this.f3054R = i;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC1292YB.m2695u(entry.getKey(), getKey()) && AbstractC1292YB.m2695u(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3055S.f2072S[this.f3054R];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3055S.f2071R[this.f3054R];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C0642M4 c0642m4 = this.f3055S;
        c0642m4.m1438h();
        Object[] objArr = c0642m4.f2071R;
        if (objArr == null) {
            objArr = AbstractC0438II.m1047u(c0642m4.f2072S.length);
            c0642m4.f2071R = objArr;
        }
        int i = this.f3054R;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
