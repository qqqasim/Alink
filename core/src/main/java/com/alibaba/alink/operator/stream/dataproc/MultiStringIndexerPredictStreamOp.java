package com.alibaba.alink.operator.stream.dataproc;

import com.alibaba.alink.operator.common.dataproc.MultiStringIndexerModelMapper;
import com.alibaba.alink.operator.batch.BatchOperator;
import com.alibaba.alink.operator.batch.dataproc.MultiStringIndexerTrainBatchOp;
import com.alibaba.alink.operator.stream.utils.ModelMapStreamOp;
import com.alibaba.alink.params.dataproc.MultiStringIndexerPredictParams;
import org.apache.flink.ml.api.misc.param.Params;

/**
 * Map string to index based on the model generated by {@link MultiStringIndexerTrainBatchOp}.
 */
public final class MultiStringIndexerPredictStreamOp
    extends ModelMapStreamOp<MultiStringIndexerPredictStreamOp>
    implements MultiStringIndexerPredictParams<MultiStringIndexerPredictStreamOp> {

    public MultiStringIndexerPredictStreamOp(BatchOperator model) {
        this(model, new Params());
    }

    public MultiStringIndexerPredictStreamOp(BatchOperator model, Params params) {
        super(model, MultiStringIndexerModelMapper::new, params);
    }
}