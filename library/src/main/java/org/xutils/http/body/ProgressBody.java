package org.xutils.http.body;

import org.xutils.http.ProgressCallbackHandler;

/**
 * Created by wyouflf on 15/8/13.
 */
public interface ProgressBody {
    void setProgressCallbackHandler(ProgressCallbackHandler progressCallbackHandler);
}