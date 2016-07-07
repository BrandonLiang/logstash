package org.logstash.common.io;

import org.logstash.ackedqueue.Checkpoint;
import java.io.IOException;

public interface CheckpointIO {

    void write(String fileName, int pageNum, int firstUnackedPageNum, long firstUnackedSeqNum, long minSeqNum, int elementCount) throws IOException;

    Checkpoint read(String fileName) throws IOException;
}
