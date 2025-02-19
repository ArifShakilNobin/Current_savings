package bits.current_savings_service.repository;

import bits.current_savings_service.domain.entity.GroupInfo;
import io.lettuce.core.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupInfoRepository extends JpaRepository<GroupInfo, Long> {
    
    

    @Query("select g.id,g.groupCode from GroupInfo g")
    Page<GroupInfo> getGroupInfos(Pageable pageable);

//    @Query("select g from GroupInfo g")
//    Page<GroupInfo> getAllGroupInfos(Pageable pageable);

//    List<GroupInfo> findAll();
}
