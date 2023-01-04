package com.emglab.qlsv.generated.callback;
public final class RetryCallback implements com.emglab.qlsv.common.RetryCallback {
    final Listener mListener;
    final int mSourceId;
    public RetryCallback(Listener listener, int sourceId) {
        mListener = listener;
        mSourceId = sourceId;
    }
    @Override
    public void retry() {
        mListener._internalCallbackRetry(mSourceId );
    }
    public interface Listener {
        void _internalCallbackRetry(int sourceId );
    }
}