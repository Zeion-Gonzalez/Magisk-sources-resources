package p000a;

import android.content.res.Resources;
import com.topjohnwu.magisk.R;

/* renamed from: a.vQ */
/* loaded from: classes.dex */
public final class C2521vQ extends AbstractC2222pt {

    /* renamed from: h */
    public int f7720h;

    /* renamed from: v */
    public final /* synthetic */ C1885jV f7721v;

    public C2521vQ(C1885jV c1885jV) {
        this.f7721v = c1885jV;
    }

    @Override // p000a.AbstractC2222pt
    /* renamed from: z */
    public final CharSequence mo1433z(Resources resources) {
        int i = this.f7720h;
        String string = resources.getString(R.string.deny);
        if (i == 0) {
            return string;
        }
        return string + " (" + this.f7720h + ")";
    }
}
