package p000a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* renamed from: a.oi */
/* loaded from: classes.dex */
public final class C2158oi extends C1420ag {

    /* renamed from: E */
    public Intent f6623E;

    /* renamed from: f */
    public String f6624f;

    /* renamed from: M */
    public static String m3770M(Context context, String str) {
        if (str != null) {
            return AbstractC1269Xn.m2588hs(str, "${applicationId}", context.getPackageName());
        }
        return null;
    }

    @Override // p000a.C1420ag
    /* renamed from: G */
    public final void mo86G(Context context, AttributeSet attributeSet) {
        super.mo86G(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC1295YE.f4150z);
        String m3770M = m3770M(context, obtainAttributes.getString(4));
        if (this.f6623E == null) {
            this.f6623E = new Intent();
        }
        this.f6623E.setPackage(m3770M);
        String string = obtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.f6623E == null) {
                this.f6623E = new Intent();
            }
            this.f6623E.setComponent(componentName);
        }
        String string2 = obtainAttributes.getString(1);
        if (this.f6623E == null) {
            this.f6623E = new Intent();
        }
        this.f6623E.setAction(string2);
        String m3770M2 = m3770M(context, obtainAttributes.getString(2));
        if (m3770M2 != null) {
            Uri parse = Uri.parse(m3770M2);
            if (this.f6623E == null) {
                this.f6623E = new Intent();
            }
            this.f6623E.setData(parse);
        }
        this.f6624f = m3770M(context, obtainAttributes.getString(3));
        obtainAttributes.recycle();
    }

    @Override // p000a.C1420ag
    public final boolean equals(Object obj) {
        boolean z;
        if (obj == null || !(obj instanceof C2158oi) || !super.equals(obj)) {
            return false;
        }
        Intent intent = this.f6623E;
        if (intent != null) {
            z = intent.filterEquals(((C2158oi) obj).f6623E);
        } else {
            z = ((C2158oi) obj).f6623E == null;
        }
        return z && AbstractC1292YB.m2695u(this.f6624f, ((C2158oi) obj).f6624f);
    }

    @Override // p000a.C1420ag
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Intent intent = this.f6623E;
        int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.f6624f;
        return filterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // p000a.C1420ag
    public final String toString() {
        ComponentName componentName;
        Intent intent = this.f6623E;
        String str = null;
        if (intent != null) {
            componentName = intent.getComponent();
        } else {
            componentName = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (componentName != null) {
            sb.append(" class=");
            sb.append(componentName.getClassName());
        } else {
            Intent intent2 = this.f6623E;
            if (intent2 != null) {
                str = intent2.getAction();
            }
            if (str != null) {
                sb.append(" action=");
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
