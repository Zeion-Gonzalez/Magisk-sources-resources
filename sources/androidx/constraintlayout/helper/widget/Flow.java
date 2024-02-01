package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import p000a.AbstractC0487JC;
import p000a.AbstractC0917RG;
import p000a.C1628ed;
import p000a.C2607x4;

/* loaded from: classes.dex */
public class Flow extends AbstractC0487JC {

    /* renamed from: U */
    public C2607x4 f8870U;

    /* renamed from: s */
    public boolean f8871s;

    /* renamed from: y */
    public boolean f8872y;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    /* renamed from: I */
    public final void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            m1173P((ConstraintLayout) parent);
        }
    }

    @Override // p000a.AbstractC0487JC
    /* renamed from: N */
    public final void mo1172N(ConstraintLayout constraintLayout) {
        m1173P(constraintLayout);
    }

    /* JADX WARN: Code restructure failed: missing block: B:552:0x00b6, code lost:
    
        if (r8.f8052Rh == (-1)) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x00c1, code lost:
    
        if (r8.f8052Rh == (-1)) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x00c3, code lost:
    
        r8.f8052Rh = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x00c5, code lost:
    
        r1 = r8.f4325Pm;
        r14 = 0;
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x00ca, code lost:
    
        r13 = r8.f4326oI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x00ce, code lost:
    
        if (r14 >= r13) goto L935;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x00d6, code lost:
    
        if (r8.f4325Pm[r14].f5046UZ != 8) goto L937;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x00d8, code lost:
    
        r16 = r16 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x00da, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x00de, code lost:
    
        if (r16 <= 0) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x00e0, code lost:
    
        r1 = new p000a.C1628ed[r13 - r16];
        r13 = 0;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x00e8, code lost:
    
        if (r13 >= r8.f4326oI) goto L938;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x00ea, code lost:
    
        r7 = r8.f4325Pm[r13];
        r18 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x00f2, code lost:
    
        if (r7.f5046UZ == 8) goto L940;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x00f4, code lost:
    
        r1[r14] = r7;
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x00f8, code lost:
    
        r13 = r13 + 1;
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x00fd, code lost:
    
        r18 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0100, code lost:
    
        r18 = r0;
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0103, code lost:
    
        r13 = r1;
        r8.f8047JG = r13;
        r8.f8046GV = r14;
        r0 = r8.f8069lz;
        r15 = r8.f8056Uf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x010c, code lost:
    
        if (r0 == 0) goto L894;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x010e, code lost:
    
        r7 = r8.f5074p;
        r1 = r8.f5022C;
        r27 = r9;
        r9 = r8.f5064j;
        r9 = r8.f5034L;
        r9 = r8.f5030Ha;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0121, code lost:
    
        if (r0 == 1) goto L796;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0124, code lost:
    
        if (r0 == 2) goto L683;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0127, code lost:
    
        if (r0 == 3) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x012a, code lost:
    
        r7 = r8.f8072vk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x012c, code lost:
    
        if (r14 != 0) goto L589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x012e, code lost:
    
        r31 = r2;
        r32 = r3;
        r33 = r4;
        r34 = r5;
        r35 = r6;
        r36 = r10;
        r39 = r11;
        r40 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0140, code lost:
    
        r15.clear();
        r30 = r18;
        r31 = r2;
        r32 = r3;
        r33 = r4;
        r34 = r5;
        r35 = r6;
        r36 = r10;
        r0 = new p000a.C0875QQ(r43, r7, r8.f5022C, r8.f5074p, r8.f5064j, r8.f5034L, r30);
        r15.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x0177, code lost:
    
        if (r7 != 0) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0179, code lost:
    
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x017d, code lost:
    
        if (r7 >= r14) goto L941;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x017f, code lost:
    
        r6 = r1 + 1;
        r5 = r13[r7];
        r4 = r30;
        r19 = r8.m4485O(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x0190, code lost:
    
        if (r5.f5030Ha[0] != 3) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0192, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0194, code lost:
    
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0195, code lost:
    
        if (r3 == r4) goto L600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x019c, code lost:
    
        if (((r8.f8063fc + r3) + r19) <= r4) goto L603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x01a0, code lost:
    
        if (r0.f2974h == null) goto L603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x01a2, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x01a4, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x01a5, code lost:
    
        if (r1 != false) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x01a7, code lost:
    
        if (r7 <= 0) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x01a9, code lost:
    
        r2 = r8.f8064fi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x01ab, code lost:
    
        if (r2 <= 0) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x01ad, code lost:
    
        if (r6 <= r2) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x01af, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x01b0, code lost:
    
        if (r1 == false) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x01b2, code lost:
    
        r23 = r10;
        r38 = r4;
        r39 = r11;
        r11 = r5;
        r40 = r12;
        r12 = r7;
        r3 = new p000a.C0875QQ(r43, r7, r8.f5022C, r8.f5074p, r8.f5064j, r8.f5034L, r38);
        r3.f2970R = r12;
        r15.add(r3);
        r0 = r3;
        r3 = r19;
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x01ec, code lost:
    
        r38 = r4;
        r23 = r10;
        r39 = r11;
        r40 = r12;
        r11 = r5;
        r12 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x01f6, code lost:
    
        if (r12 <= 0) goto L615;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x01f8, code lost:
    
        r19 = (r8.f8063fc + r19) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x01fe, code lost:
    
        r3 = r19;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x0201, code lost:
    
        r0.m2019z(r11);
        r7 = r12 + 1;
        r2 = r23;
        r30 = r38;
        r11 = r39;
        r12 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x0211, code lost:
    
        r39 = r11;
        r40 = r12;
        r12 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x0219, code lost:
    
        r39 = r11;
        r40 = r12;
        r38 = r30;
        r1 = 0;
        r2 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x0222, code lost:
    
        if (r10 >= r14) goto L950;
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x0224, code lost:
    
        r11 = r13[r10];
        r12 = r38;
        r19 = r8.m4486d(r12, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0232, code lost:
    
        if (r11.f5030Ha[1] != 3) goto L623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0234, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0236, code lost:
    
        r20 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x0238, code lost:
    
        if (r2 == r12) goto L627;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x023f, code lost:
    
        if (((r8.f8042F3 + r2) + r19) <= r12) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0243, code lost:
    
        if (r0.f2974h == null) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0245, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0247, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0248, code lost:
    
        if (r7 != false) goto L637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x024a, code lost:
    
        if (r10 <= 0) goto L637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x024c, code lost:
    
        r1 = r8.f8064fi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x024e, code lost:
    
        if (r1 <= 0) goto L637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0250, code lost:
    
        if (r1 >= 0) goto L637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0252, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0253, code lost:
    
        if (r7 == false) goto L639;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x0255, code lost:
    
        r38 = r13;
        r7 = new p000a.C0875QQ(r43, r7, r8.f5022C, r8.f5074p, r8.f5064j, r8.f5034L, r12);
        r7.f2970R = r10;
        r15.add(r7);
        r0 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0272, code lost:
    
        r38 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0274, code lost:
    
        if (r10 <= 0) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0276, code lost:
    
        r2 = (r8.f8042F3 + r19) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x027d, code lost:
    
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x027f, code lost:
    
        r0.m2019z(r11);
        r10 = r10 + 1;
        r1 = r20;
        r13 = r38;
        r38 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x028b, code lost:
    
        r12 = r38;
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x028e, code lost:
    
        r0 = r15.size();
        r1 = r8.f8051O4;
        r3 = r8.f8045G5;
        r4 = r8.f8070nB;
        r5 = r8.f8040BX;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x029e, code lost:
    
        if (r9[0] == 2) goto L651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x02a3, code lost:
    
        if (r9[1] != 2) goto L650;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x02a6, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x02a8, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x02a9, code lost:
    
        if (r2 <= 0) goto L661;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x02ab, code lost:
    
        if (r7 == false) goto L661;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x02ad, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x02ae, code lost:
    
        if (r2 >= r0) goto L944;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x02b0, code lost:
    
        r6 = (p000a.C0875QQ) r15.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x02b6, code lost:
    
        if (r7 != 0) goto L659;
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x02b8, code lost:
    
        r7 = r6.m2015P();
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x02bd, code lost:
    
        r7 = r6.m2018v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x02c1, code lost:
    
        r6.m2014N(r12 - r7);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x02c9, code lost:
    
        r6 = r3;
        r2 = r7;
        r13 = r9;
        r11 = r9;
        r7 = 0;
        r9 = 0;
        r10 = 0;
        r3 = r1;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x02d6, code lost:
    
        if (r7 >= r0) goto L947;
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x02d8, code lost:
    
        r14 = (p000a.C0875QQ) r15.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x02de, code lost:
    
        if (r7 != 0) goto L673;
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x02e2, code lost:
    
        if (r7 >= (r0 - 1)) goto L668;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x02e4, code lost:
    
        r11 = ((p000a.C0875QQ) r15.get(r7 + 1)).f2974h.f5074p;
        r41 = r15;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x02f5, code lost:
    
        r5 = r8.f8040BX;
        r41 = r15;
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x02fb, code lost:
    
        r15 = r14.f2974h.f5034L;
        r14.m2016Q(r7, r1, r2, r13, r11, r3, r6, r4, r5, r12);
        r2 = java.lang.Math.max(r9, r14.m2015P());
        r6 = r14.m2018v() + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x0325, code lost:
    
        if (r7 <= 0) goto L672;
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x0327, code lost:
    
        r6 = r6 + r8.f8042F3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x032a, code lost:
    
        r44 = r0;
        r9 = r2;
        r10 = r6;
        r0 = r13;
        r2 = r15;
        r13 = r41;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x0334, code lost:
    
        r41 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x0338, code lost:
    
        if (r7 >= (r0 - 1)) goto L676;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x033a, code lost:
    
        r13 = r41;
        r4 = ((p000a.C0875QQ) r13.get(r7 + 1)).f2974h.f5022C;
        r44 = r0;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x034c, code lost:
    
        r13 = r41;
        r44 = r0;
        r15 = r8.f8070nB;
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x0355, code lost:
    
        r0 = r14.f2974h.f5064j;
        r14.m2016Q(r7, r1, r2, r4, r11, r3, r6, r15, r5, r12);
        r1 = r14.m2015P() + r9;
        r3 = java.lang.Math.max(r10, r14.m2018v());
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x037f, code lost:
    
        if (r7 <= 0) goto L680;
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x0381, code lost:
    
        r1 = r1 + r8.f8063fc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x0384, code lost:
    
        r9 = r1;
        r10 = r3;
        r3 = 0;
        r1 = r0;
        r0 = r4;
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x038a, code lost:
    
        r7 = r7 + 1;
        r15 = r13;
        r13 = r0;
        r0 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x0392, code lost:
    
        r31[0] = r9;
        r31[1] = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x039a, code lost:
    
        r40 = r12;
        r12 = r18;
        r0 = r8.f8072vk;
        r1 = r8.f8064fi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x03b2, code lost:
    
        if (r0 != 0) goto L700;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x03b4, code lost:
    
        if (r1 > 0) goto L699;
     */
    /* JADX WARN: Code restructure failed: missing block: B:686:0x03b6, code lost:
    
        r1 = 0;
        r2 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x03b9, code lost:
    
        if (r1 >= r14) goto L953;
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x03bb, code lost:
    
        if (r1 <= 0) goto L690;
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x03bd, code lost:
    
        r2 = r2 + r8.f8063fc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x03c0, code lost:
    
        r4 = r13[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:691:0x03c2, code lost:
    
        if (r4 != null) goto L693;
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x03c5, code lost:
    
        r4 = r8.m4485O(r12, r4) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x03ca, code lost:
    
        if (r4 <= r12) goto L696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x03cd, code lost:
    
        r3 = r3 + 1;
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x03d0, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x03d3, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x03d4, code lost:
    
        r2 = r1;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x03d7, code lost:
    
        if (r1 > 0) goto L714;
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x03d9, code lost:
    
        r1 = 0;
        r2 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x03dc, code lost:
    
        if (r1 >= r14) goto L978;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x03de, code lost:
    
        if (r1 <= 0) goto L705;
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x03e0, code lost:
    
        r2 = r2 + r8.f8042F3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x03e3, code lost:
    
        r4 = r13[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x03e5, code lost:
    
        if (r4 != null) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x03e8, code lost:
    
        r4 = r8.m4486d(r12, r4) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x03ed, code lost:
    
        if (r4 <= r12) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:0x03f0, code lost:
    
        r3 = r3 + 1;
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x03f3, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x03f6, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x03f7, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x03fa, code lost:
    
        if (r8.f8073x3 != null) goto L718;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x03fc, code lost:
    
        r8.f8073x3 = new int[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x0401, code lost:
    
        if (r1 != 0) goto L721;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x0404, code lost:
    
        if (r0 == 1) goto L723;
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x0406, code lost:
    
        if (r2 != 0) goto L724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x0408, code lost:
    
        if (r0 != 0) goto L724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x040a, code lost:
    
        r15 = r42;
        r3 = r1;
        r4 = r2;
        r1 = r8;
        r9 = r27;
        r5 = r2;
        r6 = r6;
        r10 = r10;
        r13 = r13;
        r11 = r11;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x041d, code lost:
    
        r15 = r42;
        r3 = r1;
        r4 = r2;
        r1 = r8;
        r9 = r27;
        r5 = r2;
        r6 = r6;
        r10 = r10;
        r13 = r13;
        r11 = r11;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x042f, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x0431, code lost:
    
        if (r7 != false) goto L961;
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x0433, code lost:
    
        if (r0 != 0) goto L729;
     */
    /* JADX WARN: Code restructure failed: missing block: B:728:0x0435, code lost:
    
        r43 = r0;
        r45 = r1;
        r1 = (int) java.lang.Math.ceil(r14 / r4);
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x0445, code lost:
    
        r43 = r0;
        r45 = r1;
        r0 = (int) java.lang.Math.ceil(r14 / r3);
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x0453, code lost:
    
        r3 = r8.f8043FE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x0455, code lost:
    
        if (r3 == null) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x0458, code lost:
    
        if (r3.length >= r0) goto L735;
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x045b, code lost:
    
        java.util.Arrays.fill(r3, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x0460, code lost:
    
        r8.f8043FE = new p000a.C1628ed[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x0465, code lost:
    
        r3 = r8.f8057Ux;
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x0467, code lost:
    
        if (r3 == null) goto L743;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x046a, code lost:
    
        if (r3.length >= r1) goto L742;
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x046d, code lost:
    
        java.util.Arrays.fill(r3, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x0472, code lost:
    
        r8.f8057Ux = new p000a.C1628ed[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x0476, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x0477, code lost:
    
        if (r3 >= r0) goto L967;
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x0479, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x047a, code lost:
    
        if (r4 >= r1) goto L968;
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x047c, code lost:
    
        r16 = (r4 * r0) + r3;
        r17 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x0483, code lost:
    
        if (r0 != 1) goto L751;
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x0485, code lost:
    
        r16 = (r3 * r1) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x0489, code lost:
    
        r6 = r16;
        r16 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x048e, code lost:
    
        if (r6 < r13.length) goto L754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x0491, code lost:
    
        r6 = r13[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x0493, code lost:
    
        if (r6 != null) goto L757;
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x0495, code lost:
    
        r18 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x0498, code lost:
    
        r7 = r8.m4485O(r12, r6);
        r18 = r9;
        r9 = r8.f8043FE[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x04a2, code lost:
    
        if (r9 == null) goto L761;
     */
    /* JADX WARN: Code restructure failed: missing block: B:760:0x04a8, code lost:
    
        if (r9.m3098R() >= r7) goto L762;
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x04aa, code lost:
    
        r8.f8043FE[r3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:762:0x04ae, code lost:
    
        r7 = r8.m4486d(r12, r6);
        r9 = r8.f8057Ux[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x04b6, code lost:
    
        if (r9 == null) goto L766;
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x04bc, code lost:
    
        if (r9.m3101V() >= r7) goto L971;
     */
    /* JADX WARN: Code restructure failed: missing block: B:766:0x04be, code lost:
    
        r8.f8057Ux[r4] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x04c2, code lost:
    
        r4 = r4 + 1;
        r7 = r16;
        r6 = r17;
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x04cb, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x04d4, code lost:
    
        r17 = r6;
        r16 = r7;
        r18 = r9;
        r3 = 0;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x04dc, code lost:
    
        if (r3 >= r0) goto L972;
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x04de, code lost:
    
        r6 = r8.f8043FE[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x04e2, code lost:
    
        if (r6 == null) goto L974;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x04e4, code lost:
    
        if (r3 <= 0) goto L775;
     */
    /* JADX WARN: Code restructure failed: missing block: B:774:0x04e6, code lost:
    
        r4 = r4 + r8.f8063fc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x04e9, code lost:
    
        r4 = r8.m4485O(r12, r6) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x04ef, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x04f2, code lost:
    
        r3 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x04f4, code lost:
    
        if (r3 >= r1) goto L975;
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x04f6, code lost:
    
        r7 = r8.f8057Ux[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:780:0x04fa, code lost:
    
        if (r7 == null) goto L977;
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x04fc, code lost:
    
        if (r3 <= 0) goto L783;
     */
    /* JADX WARN: Code restructure failed: missing block: B:782:0x04fe, code lost:
    
        r6 = r6 + r8.f8042F3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x0501, code lost:
    
        r6 = r8.m4486d(r12, r7) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x0507, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x050a, code lost:
    
        r5[0] = r4;
        r7 = true;
        r5[1] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x0510, code lost:
    
        if (r0 != 0) goto L790;
     */
    /* JADX WARN: Code restructure failed: missing block: B:787:0x0512, code lost:
    
        if (r4 <= r12) goto L957;
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x0514, code lost:
    
        if (r0 <= 1) goto L958;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x0516, code lost:
    
        r0 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:790:0x0519, code lost:
    
        if (r6 <= r12) goto L959;
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x051b, code lost:
    
        if (r1 <= 1) goto L960;
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x051d, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:793:0x051f, code lost:
    
        r4 = r0;
        r3 = r1;
        r0 = r43;
        r1 = r45;
        r7 = r16;
        r6 = r17;
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:794:0x052d, code lost:
    
        r4 = r0;
        r3 = r1;
        r6 = r17;
        r9 = r18;
        r0 = r43;
        r1 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x0539, code lost:
    
        r43 = r0;
        r0 = r8.f8073x3;
        r0[0] = r4;
        r0[1] = r3;
        r8 = r43;
        r0 = r1;
        r2 = r2;
        r3 = r3;
        r4 = r4;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x0557, code lost:
    
        r31 = r2;
        r32 = r3;
        r33 = r4;
        r34 = r5;
        r35 = r6;
        r36 = r10;
        r39 = r11;
        r40 = r12;
        r13 = r15;
        r12 = r18;
        r10 = r8.f8072vk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:797:0x0572, code lost:
    
        if (r14 != 0) goto L799;
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x0576, code lost:
    
        r13.clear();
        r11 = new p000a.C0875QQ(r43, r10, r8.f5022C, r8.f5074p, r8.f5064j, r8.f5034L, r12);
        r13.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:800:0x058e, code lost:
    
        if (r10 != 0) goto L829;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0590, code lost:
    
        r0 = 0;
        r1 = 0;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:802:0x0593, code lost:
    
        if (r15 >= r14) goto L982;
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x0595, code lost:
    
        r7 = r13[r15];
        r19 = r8.m4485O(r12, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:804:0x05a1, code lost:
    
        if (r7.f5030Ha[0] != 3) goto L806;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x05a3, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x05a5, code lost:
    
        r20 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x05a7, code lost:
    
        if (r1 == r12) goto L810;
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x05ae, code lost:
    
        if (((r8.f8063fc + r1) + r19) <= r12) goto L813;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x05b2, code lost:
    
        if (r11.f2974h == null) goto L813;
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x05b4, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:0x05b6, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x05b7, code lost:
    
        if (r0 != false) goto L821;
     */
    /* JADX WARN: Code restructure failed: missing block: B:815:0x05b9, code lost:
    
        if (r15 <= 0) goto L821;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x05bb, code lost:
    
        r2 = r8.f8064fi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:817:0x05bd, code lost:
    
        if (r2 <= 0) goto L821;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x05c1, code lost:
    
        if ((r15 % r2) != 0) goto L821;
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x05c3, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x05c4, code lost:
    
        if (r0 == false) goto L823;
     */
    /* JADX WARN: Code restructure failed: missing block: B:822:0x05c6, code lost:
    
        r21 = r9;
        r9 = r7;
        r11 = new p000a.C0875QQ(r43, r10, r8.f5022C, r8.f5074p, r8.f5064j, r8.f5034L, r12);
        r11.f2970R = r15;
        r13.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x05e1, code lost:
    
        r21 = r9;
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:824:0x05e4, code lost:
    
        if (r15 <= 0) goto L826;
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x05e6, code lost:
    
        r1 = (r8.f8063fc + r19) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x05ed, code lost:
    
        r1 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:827:0x05ef, code lost:
    
        r11.m2019z(r9);
        r15 = r15 + 1;
        r0 = r20;
        r9 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x05f9, code lost:
    
        r21 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x05fd, code lost:
    
        r21 = r9;
        r0 = 0;
        r1 = 0;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:830:0x0602, code lost:
    
        if (r9 >= r14) goto L991;
     */
    /* JADX WARN: Code restructure failed: missing block: B:831:0x0604, code lost:
    
        r15 = r13[r9];
        r19 = r8.m4486d(r12, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:832:0x0610, code lost:
    
        if (r15.f5030Ha[1] != 3) goto L834;
     */
    /* JADX WARN: Code restructure failed: missing block: B:833:0x0612, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x0614, code lost:
    
        r20 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:835:0x0616, code lost:
    
        if (r1 == r12) goto L838;
     */
    /* JADX WARN: Code restructure failed: missing block: B:837:0x061d, code lost:
    
        if (((r8.f8042F3 + r1) + r19) <= r12) goto L841;
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x0621, code lost:
    
        if (r11.f2974h == null) goto L841;
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x0623, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x0625, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:842:0x0626, code lost:
    
        if (r0 != false) goto L849;
     */
    /* JADX WARN: Code restructure failed: missing block: B:843:0x0628, code lost:
    
        if (r9 <= 0) goto L849;
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x062a, code lost:
    
        r2 = r8.f8064fi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:845:0x062c, code lost:
    
        if (r2 <= 0) goto L849;
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:0x0630, code lost:
    
        if ((r9 % r2) != 0) goto L849;
     */
    /* JADX WARN: Code restructure failed: missing block: B:848:0x0632, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x0633, code lost:
    
        if (r0 == false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x0635, code lost:
    
        r11 = new p000a.C0875QQ(r43, r10, r8.f5022C, r8.f5074p, r8.f5064j, r8.f5034L, r12);
        r11.f2970R = r9;
        r13.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:852:0x0651, code lost:
    
        if (r9 <= 0) goto L854;
     */
    /* JADX WARN: Code restructure failed: missing block: B:853:0x0653, code lost:
    
        r1 = (r8.f8042F3 + r19) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:854:0x065a, code lost:
    
        r1 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:855:0x065c, code lost:
    
        r11.m2019z(r15);
        r9 = r9 + 1;
        r0 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x0664, code lost:
    
        r1 = r13.size();
        r2 = r8.f8051O4;
        r3 = r8.f8045G5;
        r4 = r8.f8070nB;
        r5 = r8.f8040BX;
     */
    /* JADX WARN: Code restructure failed: missing block: B:857:0x0674, code lost:
    
        if (r21[0] == 2) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:859:0x0679, code lost:
    
        if (r21[1] != 2) goto L861;
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x067c, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:862:0x067e, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:863:0x067f, code lost:
    
        if (r0 <= 0) goto L872;
     */
    /* JADX WARN: Code restructure failed: missing block: B:864:0x0681, code lost:
    
        if (r7 == false) goto L872;
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x0683, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:866:0x0684, code lost:
    
        if (r0 >= r1) goto L985;
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x0686, code lost:
    
        r6 = (p000a.C0875QQ) r13.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:868:0x068c, code lost:
    
        if (r10 != 0) goto L870;
     */
    /* JADX WARN: Code restructure failed: missing block: B:869:0x068e, code lost:
    
        r7 = r6.m2015P();
     */
    /* JADX WARN: Code restructure failed: missing block: B:870:0x0693, code lost:
    
        r7 = r6.m2018v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:871:0x0697, code lost:
    
        r6.m2014N(r12 - r7);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:872:0x069f, code lost:
    
        r6 = r3;
        r0 = r1;
        r15 = r9;
        r14 = r9;
        r7 = 0;
        r9 = 0;
        r11 = 0;
        r3 = r2;
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:873:0x06ac, code lost:
    
        if (r7 >= r1) goto L988;
     */
    /* JADX WARN: Code restructure failed: missing block: B:874:0x06ae, code lost:
    
        r44 = r5;
        r5 = (p000a.C0875QQ) r13.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x06b8, code lost:
    
        if (r10 != 0) goto L884;
     */
    /* JADX WARN: Code restructure failed: missing block: B:877:0x06bc, code lost:
    
        if (r7 >= (r1 - 1)) goto L879;
     */
    /* JADX WARN: Code restructure failed: missing block: B:878:0x06be, code lost:
    
        r14 = ((p000a.C0875QQ) r13.get(r7 + 1)).f2974h.f5074p;
        r41 = r13;
        r37 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:879:0x06cf, code lost:
    
        r41 = r13;
        r37 = r8.f8040BX;
        r14 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:880:0x06d7, code lost:
    
        r13 = r5.f2974h.f5034L;
        r5.m2016Q(r10, r0, r2, r15, r14, r3, r6, r4, r37, r12);
        r2 = java.lang.Math.max(r9, r5.m2015P());
        r5 = r5.m2018v() + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:881:0x0701, code lost:
    
        if (r7 <= 0) goto L883;
     */
    /* JADX WARN: Code restructure failed: missing block: B:882:0x0703, code lost:
    
        r5 = r5 + r8.f8042F3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:883:0x0706, code lost:
    
        r45 = r1;
        r9 = r2;
        r11 = r5;
        r2 = r13;
        r5 = r37;
        r13 = r41;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:884:0x0711, code lost:
    
        r41 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:885:0x0715, code lost:
    
        if (r7 >= (r1 - 1)) goto L887;
     */
    /* JADX WARN: Code restructure failed: missing block: B:886:0x0717, code lost:
    
        r13 = r41;
        r45 = r1;
        r15 = ((p000a.C0875QQ) r13.get(r7 + 1)).f2974h.f5022C;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:887:0x072a, code lost:
    
        r13 = r41;
        r4 = r8.f8070nB;
        r45 = r1;
        r15 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:888:0x0732, code lost:
    
        r1 = r5.f2974h.f5064j;
        r5.m2016Q(r10, r0, r2, r15, r14, r3, r6, r4, r44, r12);
        r0 = r5.m2015P() + r9;
        r3 = java.lang.Math.max(r11, r5.m2018v());
     */
    /* JADX WARN: Code restructure failed: missing block: B:889:0x075c, code lost:
    
        if (r7 <= 0) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:890:0x075e, code lost:
    
        r0 = r0 + r8.f8063fc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:891:0x0761, code lost:
    
        r5 = r44;
        r9 = r0;
        r0 = r1;
        r11 = r3;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:892:0x0767, code lost:
    
        r7 = r7 + 1;
        r1 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:893:0x076d, code lost:
    
        r31[0] = r9;
        r31[1] = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:894:0x0774, code lost:
    
        r31 = r2;
        r32 = r3;
        r33 = r4;
        r34 = r5;
        r35 = r6;
        r27 = r9;
        r36 = r10;
        r39 = r11;
        r40 = r12;
        r12 = r18;
        r2 = r8.f8072vk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:895:0x078d, code lost:
    
        if (r14 != 0) goto L898;
     */
    /* JADX WARN: Code restructure failed: missing block: B:896:0x078f, code lost:
    
        r15 = r42;
        r0 = r8;
        r9 = r27;
        r2 = r31;
        r3 = r32;
        r4 = r33;
        r5 = r34;
        r6 = r35;
        r10 = r36;
        r11 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:897:0x07a2, code lost:
    
        r12 = r40;
        r31 = r2;
        r1 = 0;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:899:0x07ae, code lost:
    
        if (r15.size() != 0) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:900:0x07b0, code lost:
    
        r9 = new p000a.C0875QQ(r43, r2, r8.f5022C, r8.f5074p, r8.f5064j, r8.f5034L, r12);
        r15.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:901:0x07c5, code lost:
    
        r9 = (p000a.C0875QQ) r15.get(0);
        r9.f2979v = 0;
        r9.f2974h = null;
        r9.f2972V = 0;
        r9.f2971S = 0;
        r9.f2970R = 0;
        r9.f2980w = 0;
        r9.f2965I = 0;
        r9.m2016Q(r2, r8.f5022C, r8.f5074p, r8.f5064j, r8.f5034L, r8.f8051O4, r8.f8045G5, r8.f8070nB, r8.f8040BX, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:902:0x0805, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:903:0x0806, code lost:
    
        if (r0 >= r14) goto L994;
     */
    /* JADX WARN: Code restructure failed: missing block: B:904:0x0808, code lost:
    
        r9.m2019z(r13[r0]);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:905:0x0810, code lost:
    
        r1 = 0;
        r31[0] = r9.m2015P();
        r2 = 1;
        r31[1] = r9.m2018v();
        r15 = r42;
        r0 = r8;
        r9 = r27;
        r3 = r32;
        r4 = r33;
        r5 = r34;
        r6 = r35;
        r10 = r36;
        r11 = r39;
        r12 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:906:0x0831, code lost:
    
        r7 = (r31[r1] + r6) + r5;
        r1 = (r31[r2] + r4) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:907:0x083d, code lost:
    
        if (r9 != 1073741824) goto L909;
     */
    /* JADX WARN: Code restructure failed: missing block: B:908:0x083f, code lost:
    
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:909:0x0842, code lost:
    
        if (r9 != Integer.MIN_VALUE) goto L911;
     */
    /* JADX WARN: Code restructure failed: missing block: B:910:0x0844, code lost:
    
        r20 = java.lang.Math.min(r7, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:911:0x084b, code lost:
    
        if (r9 != 0) goto L914;
     */
    /* JADX WARN: Code restructure failed: missing block: B:912:0x084d, code lost:
    
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:913:0x084f, code lost:
    
        r5 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:914:0x0852, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:915:0x0853, code lost:
    
        if (r11 != 1073741824) goto L917;
     */
    /* JADX WARN: Code restructure failed: missing block: B:917:0x0856, code lost:
    
        if (r11 != Integer.MIN_VALUE) goto L919;
     */
    /* JADX WARN: Code restructure failed: missing block: B:918:0x0858, code lost:
    
        r12 = java.lang.Math.min(r1, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:919:0x085f, code lost:
    
        if (r11 != 0) goto L921;
     */
    /* JADX WARN: Code restructure failed: missing block: B:920:0x0861, code lost:
    
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:921:0x0863, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:922:0x0864, code lost:
    
        r8.f8074yF = r5;
        r8.f8071tJ = r12;
        r8.m3111p(r5);
        r8.m3090F(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:923:0x0870, code lost:
    
        if (r8.f4326oI <= 0) goto L925;
     */
    /* JADX WARN: Code restructure failed: missing block: B:924:0x0872, code lost:
    
        r13 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:925:0x0874, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:926:0x0875, code lost:
    
        r8.f8060d3 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4763R(p000a.C2607x4 r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 2184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.m4763R(a.x4, int, int):void");
    }

    @Override // p000a.AbstractC0487JC, android.view.View
    /* renamed from: S */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f8872y || this.f8871s) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f1634R; i++) {
                    View view = (View) constraintLayout.f8881S.get(this.f1635S[i]);
                    if (view != null) {
                        if (this.f8872y) {
                            view.setVisibility(visibility);
                        }
                        if (this.f8871s && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // p000a.AbstractC0487JC
    /* renamed from: o */
    public final void mo1178o(C1628ed c1628ed, boolean z) {
        C2607x4 c2607x4 = this.f8870U;
        int i = c2607x4.f8059d2;
        if (i > 0 || c2607x4.f8061dG > 0) {
            if (z) {
                c2607x4.f8051O4 = c2607x4.f8061dG;
                c2607x4.f8070nB = i;
            } else {
                c2607x4.f8051O4 = i;
                c2607x4.f8070nB = c2607x4.f8061dG;
            }
        }
    }

    @Override // p000a.AbstractC0487JC, android.view.View
    public final void onMeasure(int i, int i2) {
        m4763R(this.f8870U, i, i2);
    }

    @Override // p000a.AbstractC0487JC
    /* renamed from: u */
    public final void mo1179u(AttributeSet attributeSet) {
        super.mo1179u(attributeSet);
        int[] iArr = AbstractC0917RG.f3156h;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, iArr);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f8872y = true;
                } else if (index == 22) {
                    this.f8871s = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f8870U = new C2607x4();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, iArr);
            int indexCount2 = obtainStyledAttributes2.getIndexCount();
            for (int i2 = 0; i2 < indexCount2; i2++) {
                int index2 = obtainStyledAttributes2.getIndex(i2);
                if (index2 == 0) {
                    this.f8870U.f8072vk = obtainStyledAttributes2.getInt(index2, 0);
                } else if (index2 == 1) {
                    C2607x4 c2607x4 = this.f8870U;
                    int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                    c2607x4.f8045G5 = dimensionPixelSize;
                    c2607x4.f8040BX = dimensionPixelSize;
                    c2607x4.f8059d2 = dimensionPixelSize;
                    c2607x4.f8061dG = dimensionPixelSize;
                } else if (index2 == 18) {
                    C2607x4 c2607x42 = this.f8870U;
                    int dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                    c2607x42.f8059d2 = dimensionPixelSize2;
                    c2607x42.f8051O4 = dimensionPixelSize2;
                    c2607x42.f8070nB = dimensionPixelSize2;
                } else if (index2 == 19) {
                    this.f8870U.f8061dG = obtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                } else if (index2 == 2) {
                    this.f8870U.f8051O4 = obtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                } else if (index2 == 3) {
                    this.f8870U.f8045G5 = obtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                } else if (index2 == 4) {
                    this.f8870U.f8070nB = obtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                } else if (index2 == 5) {
                    this.f8870U.f8040BX = obtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                } else if (index2 == 54) {
                    this.f8870U.f8069lz = obtainStyledAttributes2.getInt(index2, 0);
                } else if (index2 == 44) {
                    this.f8870U.f8044Fu = obtainStyledAttributes2.getInt(index2, 0);
                } else if (index2 == 53) {
                    this.f8870U.f8052Rh = obtainStyledAttributes2.getInt(index2, 0);
                } else if (index2 == 38) {
                    this.f8870U.f8050M6 = obtainStyledAttributes2.getInt(index2, 0);
                } else if (index2 == 46) {
                    this.f8870U.f8068j5 = obtainStyledAttributes2.getInt(index2, 0);
                } else if (index2 == 40) {
                    this.f8870U.f8055T0 = obtainStyledAttributes2.getInt(index2, 0);
                } else if (index2 == 48) {
                    this.f8870U.f8075zd = obtainStyledAttributes2.getInt(index2, 0);
                } else if (index2 == 42) {
                    this.f8870U.f8062fH = obtainStyledAttributes2.getFloat(index2, 0.5f);
                } else if (index2 == 37) {
                    this.f8870U.f8058W9 = obtainStyledAttributes2.getFloat(index2, 0.5f);
                } else if (index2 == 45) {
                    this.f8870U.f8067hs = obtainStyledAttributes2.getFloat(index2, 0.5f);
                } else if (index2 == 39) {
                    this.f8870U.f8054S3 = obtainStyledAttributes2.getFloat(index2, 0.5f);
                } else if (index2 == 47) {
                    this.f8870U.f8048KM = obtainStyledAttributes2.getFloat(index2, 0.5f);
                } else if (index2 == 51) {
                    this.f8870U.f8049LN = obtainStyledAttributes2.getFloat(index2, 0.5f);
                } else if (index2 == 41) {
                    this.f8870U.f8065gv = obtainStyledAttributes2.getInt(index2, 2);
                } else if (index2 == 50) {
                    this.f8870U.f8066hW = obtainStyledAttributes2.getInt(index2, 2);
                } else if (index2 == 43) {
                    this.f8870U.f8063fc = obtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                } else if (index2 == 52) {
                    this.f8870U.f8042F3 = obtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                } else if (index2 == 49) {
                    this.f8870U.f8064fi = obtainStyledAttributes2.getInt(index2, -1);
                }
            }
            obtainStyledAttributes2.recycle();
        }
        this.f1633I = this.f8870U;
        m1175V();
    }

    @Override // android.view.View
    /* renamed from: w */
    public final void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            m1173P((ConstraintLayout) parent);
        }
    }
}
