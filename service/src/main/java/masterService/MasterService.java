package masterService;


import dao.MasterDao;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import model.Master;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MasterService {

    private static final MasterService INSTANCE = new MasterService();

    public Master getMaster(Long id) {
        System.out.println(id);
        return MasterDao.getInstance().getMaster(id);
    }

    public static MasterService getInstance() {
        return INSTANCE;
    }
}
