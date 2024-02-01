package p000a;

import android.net.Uri;
import java.io.File;

/* renamed from: a.ZW */
/* loaded from: classes.dex */
public final class C1363ZW implements InterfaceC0373H7 {

    /* renamed from: h */
    public final Uri f4274h;

    /* renamed from: z */
    public final File f4275z;

    public C1363ZW(File file) {
        this.f4275z = file;
        this.f4274h = Uri.fromFile(file);
    }

    @Override // p000a.InterfaceC0373H7
    /* renamed from: h */
    public final boolean mo860h() {
        return this.f4275z.delete();
    }

    public final String toString() {
        return this.f4275z.toString();
    }

    @Override // p000a.InterfaceC0373H7
    /* renamed from: z */
    public final Uri mo861z() {
        return this.f4274h;
    }
}
