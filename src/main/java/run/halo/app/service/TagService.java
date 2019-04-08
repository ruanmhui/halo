package run.halo.app.service;

import org.springframework.lang.NonNull;
import run.halo.app.model.dto.TagOutputDTO;
import run.halo.app.model.entity.Tag;
import run.halo.app.service.base.CrudService;

import java.util.List;


/**
 * Tag service.
 *
 * @author johnniang
 */
public interface TagService extends CrudService<Tag, Integer> {

    /**
     * Get tag by slug name
     *
     * @param slugName slug name
     * @return Tag
     */
    @NonNull
    Tag getBySlugNameOfNonNull(@NonNull String slugName);

    /**
     * Converts to tag output dtos.
     *
     * @param tags tag list
     * @return a list of tag output dto
     */
    @NonNull
    List<TagOutputDTO> convertTo(List<Tag> tags);
}