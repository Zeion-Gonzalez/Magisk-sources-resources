package p000a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import java.util.List;

/* renamed from: a.PY */
/* loaded from: classes.dex */
public final class C0834PY implements InterfaceC1136VG {

    /* renamed from: R */
    public static final String[] f2819R = new String[0];

    /* renamed from: S */
    public final SQLiteDatabase f2820S;

    public C0834PY(SQLiteDatabase sQLiteDatabase) {
        this.f2820S = sQLiteDatabase;
    }

    @Override // p000a.InterfaceC1136VG
    /* renamed from: E */
    public final Cursor mo1938E(InterfaceC2386su interfaceC2386su, CancellationSignal cancellationSignal) {
        return this.f2820S.rawQueryWithFactory(new C0121CK(0, interfaceC2386su), interfaceC2386su.mo325V(), f2819R, null, cancellationSignal);
    }

    @Override // p000a.InterfaceC1136VG
    /* renamed from: HL */
    public final Cursor mo1939HL(String str) {
        return mo1941Yd(new C0163DA(str));
    }

    @Override // p000a.InterfaceC1136VG
    /* renamed from: W */
    public final void mo1940W() {
        this.f2820S.beginTransaction();
    }

    @Override // p000a.InterfaceC1136VG
    /* renamed from: Yd */
    public final Cursor mo1941Yd(InterfaceC2386su interfaceC2386su) {
        return this.f2820S.rawQueryWithFactory(new C0121CK(1, new C1929kI(interfaceC2386su)), interfaceC2386su.mo325V(), f2819R, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2820S.close();
    }

    @Override // p000a.InterfaceC1136VG
    /* renamed from: d */
    public final void mo1942d() {
        this.f2820S.beginTransactionNonExclusive();
    }

    @Override // p000a.InterfaceC1136VG
    /* renamed from: e */
    public final void mo1943e() {
        this.f2820S.setTransactionSuccessful();
    }

    @Override // p000a.InterfaceC1136VG
    public final boolean isOpen() {
        return this.f2820S.isOpen();
    }

    @Override // p000a.InterfaceC1136VG
    /* renamed from: j */
    public final InterfaceC2721zM mo1944j(String str) {
        return new C2502v7(this.f2820S.compileStatement(str));
    }

    @Override // p000a.InterfaceC1136VG
    /* renamed from: k */
    public final boolean mo1945k() {
        return this.f2820S.isWriteAheadLoggingEnabled();
    }

    @Override // p000a.InterfaceC1136VG
    /* renamed from: o */
    public final void mo1946o() {
        this.f2820S.endTransaction();
    }

    @Override // p000a.InterfaceC1136VG
    /* renamed from: od */
    public final String mo1947od() {
        return this.f2820S.getPath();
    }

    @Override // p000a.InterfaceC1136VG
    /* renamed from: s */
    public final void mo1948s(String str) {
        this.f2820S.execSQL(str);
    }

    @Override // p000a.InterfaceC1136VG
    /* renamed from: w */
    public final List mo1949w() {
        return this.f2820S.getAttachedDbs();
    }

    @Override // p000a.InterfaceC1136VG
    /* renamed from: zx */
    public final boolean mo1950zx() {
        return this.f2820S.inTransaction();
    }
}
