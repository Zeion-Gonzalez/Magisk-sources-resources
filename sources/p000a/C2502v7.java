package p000a;

import android.database.sqlite.SQLiteStatement;

/* renamed from: a.v7 */
/* loaded from: classes.dex */
public final class C2502v7 extends C2554w5 implements InterfaceC2721zM {

    /* renamed from: w */
    public final SQLiteStatement f7670w;

    public C2502v7(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f7670w = sQLiteStatement;
    }

    @Override // p000a.InterfaceC2721zM
    /* renamed from: nP */
    public final long mo4349nP() {
        return this.f7670w.executeInsert();
    }

    @Override // p000a.InterfaceC2721zM
    /* renamed from: p */
    public final int mo4350p() {
        return this.f7670w.executeUpdateDelete();
    }
}
