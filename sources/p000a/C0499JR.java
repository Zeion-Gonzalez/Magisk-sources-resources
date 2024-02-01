package p000a;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.topjohnwu.magisk.R;
import java.io.Serializable;

/* renamed from: a.JR */
/* loaded from: classes.dex */
public final class C0499JR implements InterfaceC2438tw {

    /* renamed from: h */
    public final Uri f1668h;

    /* renamed from: z */
    public final String f1669z;

    public C0499JR(Uri uri, String str) {
        this.f1669z = str;
        this.f1668h = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0499JR)) {
            return false;
        }
        C0499JR c0499jr = (C0499JR) obj;
        return AbstractC1292YB.m2695u(this.f1669z, c0499jr.f1669z) && AbstractC1292YB.m2695u(this.f1668h, c0499jr.f1668h);
    }

    @Override // p000a.InterfaceC2438tw
    /* renamed from: h */
    public final Bundle mo1128h() {
        Bundle bundle = new Bundle();
        bundle.putString("action", this.f1669z);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Uri.class);
        Uri uri = this.f1668h;
        if (isAssignableFrom) {
            bundle.putParcelable("additional_data", uri);
        } else if (Serializable.class.isAssignableFrom(Uri.class)) {
            bundle.putSerializable("additional_data", (Serializable) uri);
        }
        return bundle;
    }

    public final int hashCode() {
        int hashCode = this.f1669z.hashCode() * 31;
        Uri uri = this.f1668h;
        return hashCode + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        return "ActionFlashFragment(action=" + this.f1669z + ", additionalData=" + this.f1668h + ")";
    }

    @Override // p000a.InterfaceC2438tw
    /* renamed from: z */
    public final int mo1129z() {
        return R.id.action_flashFragment;
    }
}
