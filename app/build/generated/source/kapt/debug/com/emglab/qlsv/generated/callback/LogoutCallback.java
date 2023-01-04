package com.emglab.qlsv.generated.callback;
public final class LogoutCallback implements com.emglab.qlsv.common.LogoutCallback {
    final Listener mListener;
    final int mSourceId;
    public LogoutCallback(Listener listener, int sourceId) {
        mListener = listener;
        mSourceId = sourceId;
    }
    @Override
    public void logout() {
        mListener._internalCallbackLogout(mSourceId );
    }
    public interface Listener {
        void _internalCallbackLogout(int sourceId );
    }
}