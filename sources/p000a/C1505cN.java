package p000a;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.topjohnwu.magisk.R;

/* renamed from: a.cN */
/* loaded from: classes.dex */
public final /* synthetic */ class C1505cN implements PopupMenu.OnMenuItemClickListener {
    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        String str;
        switch (menuItem.getItemId()) {
            case R.id.action_reboot_bootloader /* 2131296331 */:
                str = "bootloader";
                break;
            case R.id.action_reboot_download /* 2131296332 */:
                str = "download";
                break;
            case R.id.action_reboot_edl /* 2131296333 */:
                str = "edl";
                break;
            case R.id.action_reboot_normal /* 2131296334 */:
                AbstractC0795Op.m1864od(C1212We.f3965u ? "recovery" : "");
                return true;
            case R.id.action_reboot_recovery /* 2131296335 */:
                str = "recovery";
                break;
            case R.id.action_reboot_userspace /* 2131296336 */:
                str = "userspace";
                break;
            default:
                return true;
        }
        AbstractC0795Op.m1864od(str);
        return true;
    }
}
