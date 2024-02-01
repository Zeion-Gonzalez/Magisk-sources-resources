package p000a;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: a.Ih */
/* loaded from: classes.dex */
public final class C0459Ih implements InterfaceC0373H7 {

    /* renamed from: h */
    public final String f1545h;

    /* renamed from: v */
    public final Uri f1546v;

    /* renamed from: z */
    public final long f1547z;

    public C0459Ih(long j, String str) {
        Uri uri;
        this.f1547z = j;
        this.f1545h = str;
        uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        this.f1546v = ContentUris.withAppendedId(uri, j);
    }

    @Override // p000a.InterfaceC0373H7
    /* renamed from: h */
    public final boolean mo860h() {
        if (AbstractC1743gn.m3275z().getContentResolver().delete(this.f1546v, "_id == ?", new String[]{String.valueOf(this.f1547z)}) == 1) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f1545h;
    }

    @Override // p000a.InterfaceC0373H7
    /* renamed from: z */
    public final Uri mo861z() {
        return this.f1546v;
    }
}
