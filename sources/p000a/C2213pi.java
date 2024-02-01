package p000a;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: a.pi */
/* loaded from: classes.dex */
public final class C2213pi {

    /* renamed from: S */
    public static final String[] f6805S = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: G */
    public final Object f6806G;

    /* renamed from: M */
    public final Object f6807M;

    /* renamed from: N */
    public final AtomicBoolean f6808N = new AtomicBoolean(false);

    /* renamed from: P */
    public final String[] f6809P;

    /* renamed from: Q */
    public volatile boolean f6810Q;

    /* renamed from: V */
    public final RunnableC1286Y5 f6811V;

    /* renamed from: W */
    public final C1789hf f6812W;

    /* renamed from: h */
    public final Map f6813h;

    /* renamed from: o */
    public final C1703g0 f6814o;

    /* renamed from: u */
    public volatile InterfaceC2721zM f6815u;

    /* renamed from: v */
    public final LinkedHashMap f6816v;

    /* renamed from: z */
    public final AbstractC1687fj f6817z;

    public C2213pi(AbstractC1687fj abstractC1687fj, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        this.f6817z = abstractC1687fj;
        this.f6813h = hashMap;
        this.f6814o = new C1703g0(strArr.length);
        new C1624eZ(abstractC1687fj);
        this.f6812W = new C1789hf();
        this.f6806G = new Object();
        this.f6807M = new Object();
        this.f6816v = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str2.toLowerCase(locale);
            this.f6816v.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.f6813h.get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.f6809P = strArr2;
        for (Map.Entry entry : this.f6813h.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str4.toLowerCase(locale2);
            if (this.f6816v.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                LinkedHashMap linkedHashMap = this.f6816v;
                Object obj = linkedHashMap.get(lowerCase2);
                if (obj == null && !linkedHashMap.containsKey(lowerCase2)) {
                    throw new NoSuchElementException("Key " + ((Object) lowerCase2) + " is missing in the map.");
                }
                linkedHashMap.put(lowerCase3, obj);
            }
        }
        this.f6811V = new RunnableC1286Y5(7, this);
    }

    /* renamed from: h */
    public final void m3853h(InterfaceC1136VG interfaceC1136VG, int i) {
        interfaceC1136VG.mo1948s("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f6809P[i];
        String[] strArr = f6805S;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            StringBuilder sb = new StringBuilder("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`room_table_modification_trigger_" + str + '_' + str2 + '`');
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            sb.append(i);
            sb.append(" AND invalidated = 0; END");
            interfaceC1136VG.mo1948s(sb.toString());
        }
    }

    /* renamed from: v */
    public final void m3854v(InterfaceC1136VG interfaceC1136VG) {
        if (interfaceC1136VG.mo1950zx()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.f6817z.f5281W.readLock();
            readLock.lock();
            try {
                synchronized (this.f6806G) {
                    int[] m3211z = this.f6814o.m3211z();
                    if (m3211z == null) {
                        return;
                    }
                    if (interfaceC1136VG.mo1945k()) {
                        interfaceC1136VG.mo1942d();
                    } else {
                        interfaceC1136VG.mo1940W();
                    }
                    try {
                        int length = m3211z.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = m3211z[i];
                            int i4 = i2 + 1;
                            if (i3 != 1) {
                                if (i3 == 2) {
                                    String str = this.f6809P[i2];
                                    String[] strArr = f6805S;
                                    for (int i5 = 0; i5 < 3; i5++) {
                                        String str2 = strArr[i5];
                                        StringBuilder sb = new StringBuilder("DROP TRIGGER IF EXISTS ");
                                        sb.append("`room_table_modification_trigger_" + str + '_' + str2 + '`');
                                        interfaceC1136VG.mo1948s(sb.toString());
                                    }
                                }
                            } else {
                                m3853h(interfaceC1136VG, i2);
                            }
                            i++;
                            i2 = i4;
                        }
                        interfaceC1136VG.mo1943e();
                        interfaceC1136VG.mo1946o();
                    } catch (Throwable th) {
                        interfaceC1136VG.mo1946o();
                        throw th;
                    }
                }
            } finally {
                readLock.unlock();
            }
        } catch (SQLiteException | IllegalStateException e) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
        }
    }

    /* renamed from: z */
    public final boolean m3855z() {
        if (!this.f6817z.m3186V()) {
            return false;
        }
        if (!this.f6810Q) {
            InterfaceC0771ON interfaceC0771ON = this.f6817z.f5278P;
            if (interfaceC0771ON == null) {
                interfaceC0771ON = null;
            }
            interfaceC0771ON.mo1790l();
        }
        if (!this.f6810Q) {
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return true;
    }
}
