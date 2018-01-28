package edu.usf.it.iam.shibboleth.controllers

import org.springframework.web.servlet.mvc.support.RedirectAttributes
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.multipart.MultipartFile
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.io.FileSystemResource
import org.springframework.core.io.ByteArrayResource
import org.springframework.http.MediaType
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import java.io.ByteArrayOutputStream
import java.io.ByteArrayInputStream
import java.util.zip.ZipOutputStream
import java.util.zip.ZipEntry
import java.io.BufferedOutputStream
import javax.servlet.http.HttpServletResponse

/**
 *
 * @author james
 */
@RestController
class ScratchController {
  
  
}
