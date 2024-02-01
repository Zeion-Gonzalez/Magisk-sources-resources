package p000a;

import android.database.Cursor;
import com.topjohnwu.magisk.core.data.SuLogDatabase_Impl;
import java.util.Iterator;
import java.util.List;

/* renamed from: a.JF */
/* loaded from: classes.dex */
public final class C0490JF extends AbstractC1796hn {

    /* renamed from: h */
    public C2605x2 f1642h;

    /* renamed from: v */
    public final C0073BQ f1643v;

    public C0490JF(C2605x2 c2605x2, C0073BQ c0073bq) {
        super(c0073bq.f310S);
        this.f1642h = c2605x2;
        this.f1643v = c0073bq;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p000a.AbstractC1796hn
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1184N(p000a.C0834PY r7) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0490JF.mo1184N(a.PY):void");
    }

    @Override // p000a.AbstractC1796hn
    /* renamed from: P */
    public final void mo1185P(C0834PY c0834py, int i, int i2) {
        mo1186Q(c0834py, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r8 <= r19) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
    
        if (r8 < r11) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
    
        r8 = true;
     */
    @Override // p000a.AbstractC1796hn
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1186Q(p000a.C0834PY r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0490JF.mo1186Q(a.PY, int, int):void");
    }

    @Override // p000a.AbstractC1796hn
    /* renamed from: h */
    public final void mo1187h() {
    }

    /* renamed from: u */
    public final void m1188u(C0834PY c0834py) {
        c0834py.mo1948s("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c0834py.mo1948s("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '40a17e1202bf2defdedb4a5de17db440')");
    }

    @Override // p000a.AbstractC1796hn
    /* renamed from: v */
    public final void mo1189v(C0834PY c0834py) {
        Cursor mo1939HL = c0834py.mo1939HL("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (mo1939HL.moveToFirst()) {
                if (mo1939HL.getInt(0) == 0) {
                    z = true;
                }
            }
            AbstractC1292YB.m2659R(mo1939HL, null);
            C0073BQ c0073bq = this.f1643v;
            c0073bq.getClass();
            c0834py.mo1948s("CREATE TABLE IF NOT EXISTS `logs` (`fromUid` INTEGER NOT NULL, `toUid` INTEGER NOT NULL, `fromPid` INTEGER NOT NULL, `packageName` TEXT NOT NULL, `appName` TEXT NOT NULL, `command` TEXT NOT NULL, `action` INTEGER NOT NULL, `target` INTEGER NOT NULL, `context` TEXT NOT NULL, `gids` TEXT NOT NULL, `time` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            c0834py.mo1948s("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            c0834py.mo1948s("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '40a17e1202bf2defdedb4a5de17db440')");
            if (!z) {
                C1379Zo m152N = C0073BQ.m152N(c0834py);
                if (!m152N.f4311S) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) m152N.f4310R));
                }
            }
            m1188u(c0834py);
            List list = ((SuLogDatabase_Impl) c0073bq.f309R).f5284u;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    AbstractC2441tz.m4202q(it.next());
                    throw null;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1292YB.m2659R(mo1939HL, th);
                throw th2;
            }
        }
    }
}
