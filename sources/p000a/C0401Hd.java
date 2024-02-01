package p000a;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: a.Hd */
/* loaded from: classes.dex */
public final class C0401Hd extends AbstractC1952kk implements InterfaceC1585dr {

    /* renamed from: q */
    public static final C2252qQ f1352q = new C2252qQ(1);

    /* renamed from: I */
    public final LinkedHashMap f1353I = new LinkedHashMap();

    @Override // p000a.AbstractC1952kk
    /* renamed from: N */
    public final void mo898N() {
        LinkedHashMap linkedHashMap = this.f1353I;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((C2145oS) it.next()).m3763z();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f1353I.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
