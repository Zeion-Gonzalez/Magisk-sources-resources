package p000a;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;

/* renamed from: a.ul */
/* loaded from: classes.dex */
public final class C2480ul extends AbstractC1021T9 implements InterfaceC1459bP {

    /* renamed from: I */
    public final /* synthetic */ View f7595I;

    /* renamed from: R */
    public final /* synthetic */ int f7596R;

    /* renamed from: q */
    public final /* synthetic */ AbstractC0928RS f7597q;

    /* renamed from: w */
    public final /* synthetic */ C0316G1 f7598w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2480ul(AbstractC1378Zn abstractC1378Zn, C0316G1 c0316g1, View view) {
        super(0);
        this.f7596R = 1;
        this.f7597q = abstractC1378Zn;
        this.f7598w = c0316g1;
        this.f7595I = view;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [a.wz] */
    /* renamed from: h */
    public final void m4256h() {
        int i = this.f7596R;
        int i2 = 0;
        final C0316G1 c0316g1 = this.f7598w;
        AbstractC0928RS abstractC0928RS = this.f7597q;
        final View view = this.f7595I;
        int i3 = 1;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                final DialogC2727zU dialogC2727zU = new DialogC2727zU(AbstractC0795Op.m1806E(view));
                final AbstractC1881jR abstractC1881jR = (AbstractC1881jR) abstractC0928RS;
                dialogC2727zU.setTitle(abstractC1881jR.mo30R().mo1433z(view.getResources()));
                dialogC2727zU.m4657W(EnumC1224Wr.f3993w, C0741Nu.f2531Z);
                String[] mo1574E = abstractC1881jR.mo1574E(view.getResources());
                final ?? r9 = new InterfaceC1814iB() { // from class: a.wz
                    @Override // p000a.InterfaceC1814iB
                    /* renamed from: z */
                    public final void mo1964z(int i4) {
                        AbstractC1881jR abstractC1881jR2 = AbstractC1881jR.this;
                        if (((Number) abstractC1881jR2.mo236y()).intValue() != i4) {
                            abstractC1881jR2.mo235s(Integer.valueOf(i4));
                            AbstractC0795Op.m1801B(abstractC1881jR2, 8);
                            c0316g1.m692I(view, abstractC1881jR2);
                        }
                    }
                };
                RecyclerView recyclerView = new RecyclerView(dialogC2727zU.getContext(), null);
                recyclerView.setNestedScrollingEnabled(false);
                dialogC2727zU.getContext();
                recyclerView.m4905EC(new LinearLayoutManager(1));
                ArrayList arrayList = new ArrayList(mo1574E.length);
                int length = mo1574E.length;
                int i4 = 0;
                while (i2 < length) {
                    arrayList.add(new C1950ki(i4, mo1574E[i2]));
                    i2++;
                    i4++;
                }
                SparseArray sparseArray = new SparseArray();
                sparseArray.put(21, new InterfaceC1814iB() { // from class: a.Ps
                    @Override // p000a.InterfaceC1814iB
                    /* renamed from: z */
                    public final void mo1964z(int i5) {
                        r9.mo1964z(i5);
                        dialogC2727zU.dismiss();
                    }
                });
                AbstractC0795Op.m1846dx(recyclerView, arrayList, sparseArray);
                AbstractC0362Gv abstractC0362Gv = dialogC2727zU.f8570k;
                abstractC0362Gv.f1221d.removeAllViews();
                abstractC0362Gv.f1221d.addView(recyclerView, -1, -2);
                dialogC2727zU.show();
                return;
            case 1:
                AbstractC1378Zn abstractC1378Zn = (AbstractC1378Zn) abstractC0928RS;
                abstractC1378Zn.mo235s(Boolean.valueOf(!((Boolean) abstractC1378Zn.mo236y()).booleanValue()));
                AbstractC0795Op.m1801B(abstractC1378Zn, 4);
                c0316g1.m692I(view, abstractC1378Zn);
                return;
            case 2:
                DialogC2727zU dialogC2727zU2 = new DialogC2727zU(AbstractC0795Op.m1806E(view));
                AbstractC1378Zn abstractC1378Zn2 = (AbstractC1378Zn) abstractC0928RS;
                dialogC2727zU2.setTitle(abstractC1378Zn2.mo30R().mo1433z(view.getResources()));
                View mo2773E = abstractC1378Zn2.mo2773E(view.getContext());
                AbstractC0362Gv abstractC0362Gv2 = dialogC2727zU2.f8570k;
                abstractC0362Gv2.f1221d.removeAllViews();
                abstractC0362Gv2.f1221d.addView(mo2773E, -1, -2);
                dialogC2727zU2.m4657W(EnumC1224Wr.f3992S, new C1064Tz(abstractC1378Zn2, c0316g1, view));
                dialogC2727zU2.m4657W(EnumC1224Wr.f3993w, C0741Nu.f2522F);
                dialogC2727zU2.show();
                return;
            default:
                DialogC2727zU dialogC2727zU3 = new DialogC2727zU(AbstractC0795Op.m1806E(view));
                dialogC2727zU3.setTitle(R.string.settings_restore_app_title);
                dialogC2727zU3.m4656G(R.string.restore_app_confirmation, new Object[0]);
                dialogC2727zU3.m4657W(EnumC1224Wr.f3992S, new C1064Tz(c0316g1, view, (C1382Zs) abstractC0928RS, i3));
                dialogC2727zU3.m4657W(EnumC1224Wr.f3993w, C0741Nu.f2520C);
                dialogC2727zU3.setCancelable(true);
                dialogC2727zU3.show();
                return;
        }
    }

    @Override // p000a.InterfaceC1459bP
    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo93z() {
        C0329GJ c0329gj = C0329GJ.f1115z;
        switch (this.f7596R) {
            case AbstractC0795Op.f2698E /* 0 */:
                m4256h();
                return c0329gj;
            case 1:
                m4256h();
                return c0329gj;
            case 2:
                m4256h();
                return c0329gj;
            default:
                m4256h();
                return c0329gj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2480ul(View view, AbstractC0928RS abstractC0928RS, C0316G1 c0316g1, int i) {
        super(0);
        this.f7596R = i;
        this.f7595I = view;
        this.f7597q = abstractC0928RS;
        this.f7598w = c0316g1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2480ul(View view, C0316G1 c0316g1, C1382Zs c1382Zs) {
        super(0);
        this.f7596R = 3;
        this.f7595I = view;
        this.f7598w = c0316g1;
        this.f7597q = c1382Zs;
    }
}
