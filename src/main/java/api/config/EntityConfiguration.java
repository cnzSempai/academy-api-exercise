package api.config;

import services.*;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }

    },
    RESPONSE_HEADERS {
        @Override
        public Class<?> getEntityService() {
            return ResponseHeadersService.class;
        }
    },

    EPISODE {
        @Override
        public Class<?> getEntityService() {
            return EpisodeServices.class;
        }
    },
    ALL_EPISODES {
        @Override
        public Class<?> getEntityService() {
            return AllEpisodeServices.class;
        }
    },
    CHARACTER {
        @Override
        public Class<?> getEntityService() {
            return CharacterService.class;
        }
    },
    ALLOC {
        @Override
        public Class<?> getEntityService() {
            return AllLocationsServices.class;
        }
    },
    LOCATION {
        @Override
        public Class<?> getEntityService() {
            return SingleLocationService.class;
        }
    };

    public abstract Class<?> getEntityService();
}
