package com.capitalone.dashboard.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QBinaryArtifact is a Querydsl query type for BinaryArtifact
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QBinaryArtifact extends EntityPathBase<BinaryArtifact> {

    private static final long serialVersionUID = -1098886827L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBinaryArtifact binaryArtifact = new QBinaryArtifact("binaryArtifact");

    public final QBaseModel _super;

    public final StringPath artifactGroupId = createString("artifactGroupId");

    public final StringPath artifactName = createString("artifactName");

    public final StringPath artifactVersion = createString("artifactVersion");

    public final QBuild buildInfo;

    public final StringPath buildNumber = createString("buildNumber");

    public final StringPath buildUrl = createString("buildUrl");

    public final StringPath canonicalName = createString("canonicalName");

    public final org.bson.types.QObjectId collectorItemId;

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath instanceUrl = createString("instanceUrl");

    public final StringPath jobName = createString("jobName");

    public final StringPath jobUrl = createString("jobUrl");

    public final MapPath<String, String, StringPath> metadata = this.<String, String, StringPath>createMap("metadata", String.class, String.class, StringPath.class);

    public final StringPath scmBranch = createString("scmBranch");

    public final StringPath scmRevisionNumber = createString("scmRevisionNumber");

    public final StringPath scmUrl = createString("scmUrl");

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public QBinaryArtifact(String variable) {
        this(BinaryArtifact.class, forVariable(variable), INITS);
    }

    public QBinaryArtifact(Path<? extends BinaryArtifact> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QBinaryArtifact(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QBinaryArtifact(PathMetadata<?> metadata, PathInits inits) {
        this(BinaryArtifact.class, metadata, inits);
    }

    public QBinaryArtifact(Class<? extends BinaryArtifact> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.buildInfo = inits.isInitialized("buildInfo") ? new QBuild(forProperty("buildInfo"), inits.get("buildInfo")) : null;
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
    }

}

