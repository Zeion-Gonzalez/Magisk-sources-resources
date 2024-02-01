package p000a;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: a.CK */
/* loaded from: classes.dex */
public final /* synthetic */ class C0121CK implements SQLiteDatabase.CursorFactory {

    /* renamed from: h */
    public final /* synthetic */ Object f421h;

    /* renamed from: z */
    public final /* synthetic */ int f422z;

    public /* synthetic */ C0121CK(int i, Object obj) {
        this.f422z = i;
        this.f421h = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        int i = this.f422z;
        Object obj = this.f421h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((InterfaceC2386su) obj).mo324G(new C2554w5(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                ((C1929kI) obj).f5994R.mo324G(new C2554w5(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
